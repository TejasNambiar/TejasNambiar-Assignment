package com.Security.Assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User";
	}
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
}

