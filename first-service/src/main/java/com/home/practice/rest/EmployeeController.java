package com.home.practice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RefreshScope
public class EmployeeController {
	
//	@Value("${firstName}")
//	private String employeeName;
	
	@Autowired
    private Environment env;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String getEmployees() {
		System.out.println(env.getProperty("firstName"));
		return "";
	}
}
