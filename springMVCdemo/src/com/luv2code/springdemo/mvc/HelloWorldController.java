package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/showform")
	public String showForm() {
		return "form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "formdata";
	}

	@RequestMapping("processFormVersionTwo")
	public String processFormVersion(HttpServletRequest request, Model model) {
		// read data from html form
		String name = request.getParameter("sName");
		// convert it to uppercase
		name = name.toUpperCase();
		// create message
		String result = name;
		// add message to model
		model.addAttribute("message", result);
		return "formdata";
	}

	@RequestMapping("processformversionthree")
	public String processFormVersionThree(@RequestParam("sName") String name, Model model) {
		name = name.toUpperCase();
		String result = name;
		model.addAttribute("message", result);
		return "formdata";
	}
}
