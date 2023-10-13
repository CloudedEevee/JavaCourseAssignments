package com.makaylass.loginreg.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.makaylass.loginreg.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    // this method retrieves all the users from the database
    List<User> findAll();
    // this method finds user with email
    Optional<User> findByEmail(String email);
    // this method finds users with userNames containing the search string
    List<User> findByUserNameContaining(String search);
    // this method counts how many names contain a certain string
    Long countByUserNameContaining(String search);
    // this method deletes a user that starts with a specific name
    Long deleteByUserNameStartingWith(String search);
}