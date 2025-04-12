package com.telusko.TeluskoMicroservice1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TeluskoService {

	@Autowired
	private TeluskoFeignClient feignClient;
	
	public String getCourseInfo()
	{
		//OLD REST TEMPLATE IMPLIMENTATION
//		RestTemplate restTemplate=new RestTemplate();
//		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8582/course-info",
//				String.class);
//		
//		return response.getBody()+ " Coming from a another rest api";
		ResponseEntity<String> response=feignClient.getCourseInfo();
		return response.getBody()+ " Coming from a another rest api";
	}
}
