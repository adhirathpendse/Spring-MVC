package com.practise.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/cafe")
	public String handleWelcome(HttpServletRequest request, Model model) {
		
		model.addAttribute("userName", request.getParameter("nameField"));
		
		return "Welcome";
	}
}
