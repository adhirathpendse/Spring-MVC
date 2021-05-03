package com.practise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping(path="/main")
	@ResponseBody
	public String handleMainRequest() {
		return "Main request captured";
	}
}
