package com.amdocs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping("/launch")

	public String launchPage()
	{
		return "register";
	}

	@PostMapping("/register")
	public String regUser(@RequestParam String un, @RequestParam String pw, Model model)
	{
        model.addAttribute("message", "Registration successful for " + un);
		return "register";
	}
}
