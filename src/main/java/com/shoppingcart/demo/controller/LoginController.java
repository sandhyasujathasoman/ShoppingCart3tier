package com.shoppingcart.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.demo.model.User;

@RestController
@RequestMapping("/users/authenticate")
@CrossOrigin
public class LoginController {

	@PostMapping(consumes = "application/json")
	public String registration(@RequestBody User userForm) {
		return "You have been registered successfully.";
	}

	@GetMapping
	public String login(User user) {
		if (user != null)
			return "You have been logged out successfully.";
		return "You have been logged out successfully.";

	}

}
