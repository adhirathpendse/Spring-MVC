package com.practise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/welcome")
	//@ResponseBody
	public String handleWelcome() {
		return "Welcome-MVC";
	}

}
