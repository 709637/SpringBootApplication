package io.firstapp.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)//consumes= "application/json", produces="application/json"
	public String hello() {
		return "Hello,,,I am from Hello Controller";
	} 

}