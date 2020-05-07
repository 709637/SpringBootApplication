package io.firstapp.springbootstarter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class CourseApiApp extends SpringBootServletInitializer {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CourseApiApp.class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		SpringApplication.run(CourseApiApp.class, args);
        System.out.println("Hi... This application is up and running fine...");
	}

}
