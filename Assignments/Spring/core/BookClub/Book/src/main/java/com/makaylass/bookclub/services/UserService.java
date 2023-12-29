package com.makaylass.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.makaylass.bookclub.models.LoginUser;
import com.makaylass.bookclub.models.User;
import com.makaylass.bookclub.repositories.UserRepository;

@Service
public class UserService {
    // adding the user repository as a dependency
	@Autowired
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    // creates / edits a user
    public User createUser(User e) {
    	return userRepository.save(e);
    }
    // returns all the users
    public List<User> allUsers() {
        return userRepository.findAll();
    }
    // retrieves a user
    public User findUser(Long id) {
    	Optional<User> optionalUser = userRepository.findById(id);
    	if(optionalUser.isPresent()) {
    		return optionalUser.get();
    	} else {
    		return null;
    	}
    }
    // deletes a user
    public void deleteUser(Long id) {
    	userRepository.deleteById(id);
    }
    
    // called by controller to register user or redirect if errors
    public User register(User newUser, BindingResult result) {
    	// Reject values or register if no errors:
	    	// Reject if password doesn't match confirmation
	    	if (!newUser.getPassword().equals(newUser.getConfirm())) {
	    		result.rejectValue("confirm", "Matches", "Confirm Password and Password must match.");
	    	}
	    	// Reject if email is taken (present in database)
	    	Optional<User> potentialUser = userRepository.findByEmail(newUser.getEmail());
	    	if (potentialUser.isPresent()) {
	    		result.rejectValue("email", "Matches", "Email is already in use.");
	    	}
	    	// Return Null if result has errors
	    	if (result.hasErrors()) {
	    		return null;
	    	}
            
            // Hash and set password, save user to database
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            userRepository.save(newUser);
            return newUser;
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        // Reject if email not found
    	Optional<User> potentialLogin = userRepository.findByEmail(newLogin.getEmail());
        if (!potentialLogin.isPresent()) {
        	result.rejectValue("email", "Matches", "Incorrect email or password.");
        	return null;
        }
        // Reject if password incorrect
        if (!BCrypt.checkpw(newLogin.getPassword(), potentialLogin.get().getPassword())) {
        	result.rejectValue("password", "Matches", "Incorrect email or password.");
        }
        // Return Null if result has errors
        if(result.hasErrors()) {
        	return null;
        }
        
        // Otherwise, return user object
        return this.findUser(potentialLogin.get().getId());
        
    }
}