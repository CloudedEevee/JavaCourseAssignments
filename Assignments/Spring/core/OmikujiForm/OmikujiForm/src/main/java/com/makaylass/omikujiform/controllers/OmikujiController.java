package com.makaylass.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {

	@RequestMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@RequestMapping("/omikuji")
	public String omikuji() {
		return "omikuji.jsp";
	}
	
	@RequestMapping(value="/omikuji/submit", method=RequestMethod.POST)
	public String submit(
			@RequestParam(value="num") int num,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="livingThing") String livingThing,
			@RequestParam(value="someNice") String someNice, 
			HttpSession session
			) {
		// Form to Session
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("someNice", someNice);
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session) {
		return "show.jsp";
	}
	
}
