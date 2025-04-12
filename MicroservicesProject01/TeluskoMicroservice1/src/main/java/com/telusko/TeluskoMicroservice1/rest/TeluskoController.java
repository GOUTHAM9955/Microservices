package com.telusko.TeluskoMicroservice1.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeluskoController 
{

	@GetMapping("/course-info")
	public ResponseEntity<String> getCourseInfo()
	{
		String info="Telusko Has Launched DevOps with AWS course and New Java course";
		return new ResponseEntity<String>(info,HttpStatus.OK);
	}
}
