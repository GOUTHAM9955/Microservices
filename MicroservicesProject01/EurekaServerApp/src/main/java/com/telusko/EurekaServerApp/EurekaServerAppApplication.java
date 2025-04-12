package com.telusko.EurekaServerApp;
// We are just touching Eureka Server in this application
/*
We ned to add "Eureka server" dependecy from spring

We used @EnableEurekaServer annotation to enable it

We can go to http//localhost:8761 to view eureka server and to register the replicas it is useful to deploy it in 8761 port

We added a property to not register to self register in Euraka server
	>> eureka.client.register-with-eureka=false
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerAppApplication.class, args);
	}

}
