package com.telusko.TeluskoMicroservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
// In this project we are trying to create a microservice and register it in eureka and admin servers
/*
For that we need to add
	Eureka Discovery client
	Actuator
	Admin client dependecies along with regular Sping Boot dependencies

If the eureka server is not present in port 8761 we have to specify it explicaitly in it
We used @EnableDiscoveryClient

To  register the application in admin server we added below property
	spring.boot.admin.client.url=http://localhost:1414/


 */
@SpringBootApplication
@EnableDiscoveryClient
public class TeluskoMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(TeluskoMicroservice1Application.class, args);
	}

}
