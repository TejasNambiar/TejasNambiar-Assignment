package com.springRest.Assignment2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authentication {

	private static final String usernameAuth = "naveen";
	private static final String passwordAuth = "123";

	@GetMapping("/login/{name}/{password}")
	public String getHello(@PathVariable("name") String username, @PathVariable("password") String password) {
		System.out.println(username + " " + password);
		if (username.equals(usernameAuth) && password.equals(passwordAuth)) {
			return "valid";
		}
		return "invalid";

	}
}