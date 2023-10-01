package com.makaylass.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.makaylass.savetravels.models.Expense;
import com.makaylass.savetravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/";
		}
		else {
			expenseService.createExpense(expense);
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/view/{id}")
	public String view(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		Expense thisExpense = expenseService.findExpense(id);
		model.addAttribute("expense", thisExpense);
		return "view.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String viewEdit(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		Expense thisExpense = expenseService.findExpense(id);
		model.addAttribute("expense", thisExpense);
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String submitEdit(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/edit{id}";
		}
		else {
			expenseService.createExpense(expense);
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
	
	
	
	
	
	
}
