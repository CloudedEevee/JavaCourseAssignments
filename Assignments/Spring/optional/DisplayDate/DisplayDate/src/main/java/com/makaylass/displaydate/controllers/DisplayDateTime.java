package com.makaylass.displaydate.controllers;


import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateTime {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("E, MMM d, yyyy");
		String fmtDate = formatter.format(date);
		model.addAttribute("date", fmtDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("h:m a");
		String fmtTime = formatter.format(date);
		model.addAttribute("time", fmtTime);
		return "time.jsp";
	}
}
