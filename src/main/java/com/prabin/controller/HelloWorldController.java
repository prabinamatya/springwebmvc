package com.prabin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, value = "/sayhello")
	public String showHelloWorld(Model model) {
		model.addAttribute("helloWorldMessage", "Setting up values from the spring controller");
		return "hello";
	}
}
