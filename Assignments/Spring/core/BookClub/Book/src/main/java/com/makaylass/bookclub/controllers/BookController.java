package com.makaylass.bookclub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.makaylass.bookclub.models.Book;
import com.makaylass.bookclub.services.BookService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService bookService;
	
	//////////////////////////////////////// Books > Home Page
	@GetMapping("")
	public String home(Model model, HttpSession session) {
		if (session.getAttribute("thisUser") == null) {
			return "redirect:/";
		}
		List<Book> allBooks = bookService.allBooks();
		model.addAttribute("allBooks", allBooks);
		return "books.jsp";
	}
	
	
	//////////////////////////////////////// New Book
	@GetMapping("/new")
	public String newBook(@ModelAttribute("newBook") Book newBook, BindingResult result, Model model, HttpSession session) {
		if (session.getAttribute("thisUser") == null) {
			return "redirect:/";
		}
		model.addAttribute("newBook", new Book());
		return "newBook.jsp";
	}
	
	@PostMapping("/new/process")
	public String createBook(@ModelAttribute("newBook") Book newBook, BindingResult result, Model model, HttpSession session) {
		if (session.getAttribute("thisUser") == null) {
			return "redirect:/";
		}
		if (result.hasErrors()) {
			System.out.println(newBook.getUser().getId());
			model.addAttribute("newBook", new Book());
			return "newBook.jsp";
		}
		bookService.createBook(newBook);
		return "redirect:/books";
	}
}
