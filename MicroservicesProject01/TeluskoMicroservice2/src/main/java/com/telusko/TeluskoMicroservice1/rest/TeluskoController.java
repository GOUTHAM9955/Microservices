package com.telusko.TeluskoMicroservice1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.TeluskoMicroservice1.service.TeluskoService;

@RestController
public class TeluskoController 
{

	@Autowired
	private TeluskoService service;
	
	@GetMapping("/course-details")
	public ResponseEntity<String> getCourseInfo()
	{
		// GETTING INFO FROM SERVICE CLASS WHICH IS IMPLEMENTING FEIGN CLIENT TO GET INFO FROM MICROSERVICE1, CHECK SERVICE CLASS
		String info=service.getCourseInfo();
		return new ResponseEntity<String>(info,HttpStatus.OK);
	}
}
