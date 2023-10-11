package com.makaylass.relationships.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.makaylass.relationships.models.Dojo;
import com.makaylass.relationships.models.Ninja;
import com.makaylass.relationships.services.DojoService;
import com.makaylass.relationships.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	/////////////////////////// INDEX
	@GetMapping("/")
	public String index() {
		return "redirect:/dojos/dashboard";
	}
	
	
	
	
	
	
	/////////////////////////// dojo dashboard
	@GetMapping("/dojos/dashboard")
	public String dojoDashboard(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> allDojos = dojoService.allDojos();
		model.addAttribute("allDojos", allDojos);
		return "dojoDashboard.jsp";
	}
	
	@PostMapping("/dojos/dashboard")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			return "redirect:/dojos/dashboard";
		}
		else {
			Dojo thisDojo = dojoService.createDojo(dojo);
			return "redirect:/dojos/" + thisDojo.getId();
		}
		
	}
	
	/////////////////////////// show dojo
	@GetMapping("/dojos/{dojoId}")
	public String showDojo(@PathVariable("dojoId") Long id, Model model) {
		
		Dojo thisDojo = dojoService.findDojo(id);
		model.addAttribute("dojo", thisDojo);
		return "showDojo.jsp";
		
	}
	
	/////////////////////////// delete dojo
	@GetMapping("/dojos/{dojoId}/delete")
	public String deleteDojo(@PathVariable("dojoId") Long id, Model model) {
		dojoService.deleteDojo(id);
		return "redirect:/dojos/dashboard";
		
	}
	
	
	
	
	
	
	
	/////////////////////////// new ninja
	@GetMapping("/dojos/{dojoId}/ninjas/new")
	public String newNinja(@PathVariable("dojoId") Long id, @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		model.addAttribute("dojoId", id);
		model.addAttribute("allDojos", dojoService.allDojos());
		model.addAttribute("ninja", new Ninja());
		return "newNinja.jsp";
	}

	@PostMapping("/dojos/{dojoId}/ninjas/new/process")
	public String createNinja(@PathVariable("dojoId") Long id, @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("allDojos", dojoService.allDojos());
			model.addAttribute("dojoId", id);
			return "newNinja.jsp";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/dojos/" + id;
	}
	

}
