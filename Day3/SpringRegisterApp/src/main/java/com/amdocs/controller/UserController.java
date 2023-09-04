package com.amdocs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/launch")
    public String launchPage() {
    	
    	return "register";
    	
    }
}
