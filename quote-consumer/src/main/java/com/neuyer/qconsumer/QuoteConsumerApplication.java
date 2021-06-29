package com.neuyer.qconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class QuoteConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteConsumerApplication.class, args);
	}

}
