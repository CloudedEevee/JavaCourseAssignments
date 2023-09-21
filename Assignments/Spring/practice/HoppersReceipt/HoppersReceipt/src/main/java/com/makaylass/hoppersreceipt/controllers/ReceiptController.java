package com.makaylass.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ReceiptController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Emily Stone";
        String itemName = "Midnight House Quartz Slab";
        double price = 1000;
        String description = "Slab of charcoal grey and black Quartz stone.";
        String vendor = "Slabs of Rocc";
    
    	model.addAttribute("name", name)
    		.addAttribute("itemName", itemName)
    		.addAttribute("price", price)
    		.addAttribute("description", description)
    		.addAttribute("vendor", vendor);
    		
        return "index.jsp";
    }
    //...
    

}
