package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelpController {
	@RequestMapping("/showform")
public String getProcess() {
	return "formdata";
}
}
