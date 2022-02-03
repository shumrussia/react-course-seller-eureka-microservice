package com.sha.springbootmicroservice4eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootMicroservice4EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroservice4EurekaApplication.class, args);
	}

}
