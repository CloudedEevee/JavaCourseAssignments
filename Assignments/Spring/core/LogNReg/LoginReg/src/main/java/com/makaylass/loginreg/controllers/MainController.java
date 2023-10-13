package com.makaylass.loginreg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.makaylass.loginreg.models.LoginUser;
import com.makaylass.loginreg.models.User;
import com.makaylass.loginreg.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	
	
	//////////////////////////////////////// Index
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	
	//////////////////// Register
	@PostMapping("/user/register")
	public String reg(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
		// check user reg validation
		
		if (userService.register(newUser, result) == null) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		session.setAttribute("thisUser", userService.createUser(newUser));
		return "redirect:/home";
	}

	//////////////////// Login
	@PostMapping("/user/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
		
		User potentialUser = userService.login(newLogin, result);
		if ( potentialUser == null) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}

		session.setAttribute("thisUser", potentialUser);
		return "redirect:/home";
	}
	
	//////////////////////////////////////// Home
	@GetMapping("/home")
	public String home(Model model, HttpSession session) {
		if (session.getAttribute("thisUser") == null) {
			return "redirect:/";
		}
		return "home.jsp";
	}
	
	//////////////////// Logout
	@GetMapping("/home/logout")
	public String logout(Model model, HttpSession session) {
		session.removeAttribute("thisUser");
		return "redirect:/";
	}
}
