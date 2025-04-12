package com.telusko.TeluskoMicroservice1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

// THE SERVICE NAME I GOT IT FROM APPLICATION SERVER
@FeignClient(name="TELUSKOMICROSERVICE1")
public interface TeluskoFeignClient 
{
	// METHOD SIGNATURE FROM THE SERVICE WHICH WE ARE CALLING
	@GetMapping("/course-info")
	public ResponseEntity<String> getCourseInfo();
}
