package com.jenkins.practice.jenkinsproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class JenkinsprojectApplicationTests {

	@Autowired
	private JenkinsprojectApplication jenkinsProjectApplicationObj;
	
	@Test
	void addTest() throws UnsupportedEncodingException, Exception {
		assertEquals(3, jenkinsProjectApplicationObj.add(1, 2));
	}

}
