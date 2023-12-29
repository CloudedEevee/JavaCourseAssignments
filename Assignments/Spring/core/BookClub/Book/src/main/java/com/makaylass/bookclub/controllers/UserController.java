package com.makaylass.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.makaylass.bookclub.models.LoginUser;
import com.makaylass.bookclub.models.User;
import com.makaylass.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	//////////////////// Register
	@PostMapping("/register")
	public String reg(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
		// check user reg validation
		User potentialUser = userService.register(newUser, result);
		if (potentialUser == null) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		session.setAttribute("thisUser", potentialUser);
		return "redirect:/books";
	}

	//////////////////// Login
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
		
		User potentialUser = userService.login(newLogin, result);
		if ( potentialUser == null) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}

		session.setAttribute("thisUser", potentialUser);
		return "redirect:/books";
	}
	
	//////////////////// Logout
	@GetMapping("/logout")
	public String logout(Model model, HttpSession session) {
		session.removeAttribute("thisUser");
		return "redirect:/";
	}
}
