package com.practice.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("/")
	public String helloHuman(@RequestParam(required = false) String name, String lastName) {
		if (name == null && lastName == null) {
			return "Hello human";

			}
		else if (name != null && lastName == null) {
			return "Hello " + name;
		}
		else if (name == null && lastName != null) {
			return "Hello " + lastName;
		}
		String searchQuery = String.format("%s %s", name, lastName);
		return "Hello " + searchQuery;
		}
}
