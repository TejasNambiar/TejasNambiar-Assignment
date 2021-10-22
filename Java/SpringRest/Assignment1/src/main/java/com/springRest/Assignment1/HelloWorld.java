package com.springRest.Assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/helloworld")
	public String getHelloWorld() {
		return "Hellow World";
	}
}
