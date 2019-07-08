package com.shoppingcart.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/authenticate")
@CrossOrigin
public class LoginController {
	
	 @GetMapping
	    @ResponseStatus(HttpStatus.OK)
	    public String auithenticated(){
	        return "SuccessFully Logged In";
	    }
	 
	 @GetMapping("/register")
	    @ResponseStatus(HttpStatus.OK)
	    public String register(){
	        return "User SuccessFully Registered";
	    }

}
