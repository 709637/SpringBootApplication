package io.firstapp.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)//consumes= "application/json", produces="application/json"
	public String hello() {
		return "Hello,,,I am from Hello Controller";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)//consumes= "application/json", produces="application/json"
	public String hello1() {
		return "Hello,,,I am from Hello Controller USER";
	} 
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)//consumes= "application/json", produces="application/json"
	public String hello2() {
		return "Hello,,,I am from Hello Controller  ADMIN";
	} 

}
