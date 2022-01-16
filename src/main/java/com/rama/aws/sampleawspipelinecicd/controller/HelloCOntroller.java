package com.rama.aws.sampleawspipelinecicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCOntroller {
	
	public String hello()
	{
		return "Hello YouTube";
	}

}
