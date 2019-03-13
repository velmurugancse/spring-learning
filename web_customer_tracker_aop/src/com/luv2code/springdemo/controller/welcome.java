package com.luv2code.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class welcome {
	
	@RequestMapping("/abc")
	public String listCustomers(Model theModel) {
		
		System.out.println("check");
		
		return "welcome";
	}
	
}


