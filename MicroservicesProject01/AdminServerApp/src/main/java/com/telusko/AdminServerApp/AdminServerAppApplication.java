package com.telusko.AdminServerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
// We are just touching Admin Server in this application which maintains all the actuator endpoints
/*
We need to add "codecentric's Spring Boot Admin Server" dependency
To enable adminserver we use @EnableAdminServer annotaion


 */
@SpringBootApplication
@EnableAdminServer
public class AdminServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServerAppApplication.class, args);
	}

}
