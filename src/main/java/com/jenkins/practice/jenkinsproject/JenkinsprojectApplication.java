package com.jenkins.practice.jenkinsproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsprojectApplication {

	Logger logger = LoggerFactory.getLogger("JenkinsprojectApplication");
	
	@GetMapping(path = "/add/{one}/{two}")
	public int add(@PathVariable("one") int one, @PathVariable("two") int two) {
		logger.info("Inside Add Method");
		return one + two;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsprojectApplication.class, args);
	}

}


