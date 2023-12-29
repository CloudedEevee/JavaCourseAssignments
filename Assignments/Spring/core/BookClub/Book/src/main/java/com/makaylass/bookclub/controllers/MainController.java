package com.makaylass.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.makaylass.bookclub.models.LoginUser;
import com.makaylass.bookclub.models.User;
import com.makaylass.bookclub.services.BookService;
import com.makaylass.bookclub.services.UserService;

@Controller
public class MainController {
	@Autowired
	UserService userService;
	@Autowired
	BookService bookService;
	
	
	//////////////////////////////////////// Index > Login/Reg Page
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}

	

}
