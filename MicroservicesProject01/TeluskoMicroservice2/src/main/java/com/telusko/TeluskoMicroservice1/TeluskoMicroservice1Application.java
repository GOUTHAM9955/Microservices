package com.telusko.TeluskoMicroservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
// IN THIS WE ARE GOING TO EXPLORE FEIGN CLIENT FOR SERVICE TO SERVICE COMMUNICATION
//CHECK CONTROLLLER AND SERVICE CLASS
/*
THE MAIN USE OF FEIGN CLIENT IS, IN REST TEMPLATE OR WEB CLIENT WE HAVE TO SPECIFY WHERE THE APPLICATION IS HOSTED.
IN CASE OF MICROSEVICES WITH AUTOSCALING IF THERE ARE MULTIPLE INSTANCES IT ISN'T POSSIBLE TO HARD CODE ALL THOSE INSTANCES SO WE USE FEIGN CLIENT
	FOR FEIGNCLIENT WE HAVE TO ADD "OPENFEIGN" DEPENDENCY
WE HAVE TO USE "@EnableFeignClients" ANNOTATION ON MAIN METHOD CLASS
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class TeluskoMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(TeluskoMicroservice1Application.class, args);
	}

}
