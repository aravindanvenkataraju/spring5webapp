package com.aravindan.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aravindan.springframework.spring5webapp.model.repositories.AuthorRepository;
import com.aravindan.springframework.spring5webapp.model.repositories.BookRepository;

@Controller
public class AuthorController {
	
	private AuthorRepository authorRepository;
	
	
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getAuhtors(Model model) {
		
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}
}
