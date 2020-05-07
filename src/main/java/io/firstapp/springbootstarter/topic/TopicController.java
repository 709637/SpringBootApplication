package io.firstapp.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/Topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("Javascript","Javascript Description","Angular js,React JS"),
				new Topic(".Net","MVC ","ASP.Net, MVC, ADO.Net" ),
				new Topic("Java","(String Boot)","Core Java"));
	} 
}
