package com.makaylass.testnewproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class TestNewProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestNewProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/new")
	public String new_route() {
		return "This is a NEW test!";
	}

}
