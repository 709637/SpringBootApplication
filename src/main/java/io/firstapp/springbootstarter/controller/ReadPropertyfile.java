package io.firstapp.springbootstarter.controller;

import java.io.IOException;
import java.util.Properties;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadPropertyfile {
	
	@RequestMapping(value="/prop", method=RequestMethod.GET)//consumes= "application/json", produces="application/json"
	public String getproperty() throws IOException {
		 
		Properties prop=new Properties();
		prop.load(ReadPropertyfile.class.getResourceAsStream("/io/firstapp/springbootstarter/properties/customprop.properties"));
		String s = prop.getProperty("property3");
		System.out.println("output"+ s);
		return s;
		
	} 


}
