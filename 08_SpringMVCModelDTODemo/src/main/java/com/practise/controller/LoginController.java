package com.practise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.practise.dto.User;

@EnableWebMvc
@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loadLandingPage() {
		return "login";
	}
	
	@RequestMapping("/submitLogin")
	public String handleLogin(User user, Model model) {
		model.addAttribute(user);
		return "dashboard";
	}

}
