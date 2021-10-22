package com.springRest.Assignment6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

	@GetMapping("/login/{name}/{password}")
	public String getHello(@PathVariable("name") String username, @PathVariable("password") String password) {
		System.out.println(username + " " + password);
		return "invalid";

	}

	@GetMapping("/add/{a}/{b}")
	public String sumoftwo(@PathVariable int a, @PathVariable int b) {
		int c = a + b;
		return ("Addition of two numbers is " + c);

	}

	@GetMapping("/sub/{a}/{b}")
	public String suboftwo(@PathVariable int a, @PathVariable int b) {
		int c = a - b;
		return ("Subtraction of two numbers is " + c);

	}

	@GetMapping("/mul/{a}/{b}")
	public String muloftwo(@PathVariable int a, @PathVariable int b) {
		int c = a * b;
		return ("Multiplication of two numbers is " + c);

	}

	@GetMapping("/div/{a}/{b}")
	public String divoftwo(@PathVariable int a, @PathVariable int b) {
		int c = a / b;
		return ("Division of two numbers is " + c);

	}

	@GetMapping("/sqt/{a}/{b}")
	public String sqrtoftwo(@PathVariable int a, @PathVariable int b) {
		double c = Math.sqrt(a);
		return ("Square root of number is " + c);

	}
}