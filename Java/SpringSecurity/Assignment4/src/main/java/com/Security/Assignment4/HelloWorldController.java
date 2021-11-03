package com.Security.Assignment4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@ResponseBody
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/authenticate")
	public String authenticate(@ModelAttribute("user") User user) {
		if(user.getUsername().compareTo("naveen")!=0) {
			return "ulogin";
		}
		else if(user.getUsername().compareTo("naveen")==0 && user.getPassword().compareTo("1234")!=0) {
			user.setFailedAttempts(user.getFailedAttempts()+1);
			return "plogin";
		}
		else
			return "hello";
			
	}
}
