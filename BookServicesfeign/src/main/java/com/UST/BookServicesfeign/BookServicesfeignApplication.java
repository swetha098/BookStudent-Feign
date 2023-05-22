package com.UST.BookServicesfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

public class BookServicesfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServicesfeignApplication.class, args);
	}

}
