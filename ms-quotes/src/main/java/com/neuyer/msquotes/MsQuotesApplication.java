package com.neuyer.msquotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsQuotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsQuotesApplication.class, args);
	}

}
