package com.springRest.Assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {

	@Autowired
	StateService stateService;

	@GetMapping("/state/{name}")
	public State getHello2(@PathVariable("name") String username) {
		System.out.println(username);
		Long zipCode = Long.parseLong(username);
		return stateService.getState(zipCode);

	}

}
