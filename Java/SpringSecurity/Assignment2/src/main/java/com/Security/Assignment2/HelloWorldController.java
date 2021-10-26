package com.Security.Assignment2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/")
	public String hello() {
		return "<h1>Hello World</h1>";
	}

	@RequestMapping(value = "/admin")
	public String helloAdmin() {
		return "<h1>Hello Admin</h1>";
	}

	@RequestMapping(value = "/user")
	public String helloUser() {
		return "<h1>Hello User</h1>";
	}
}
