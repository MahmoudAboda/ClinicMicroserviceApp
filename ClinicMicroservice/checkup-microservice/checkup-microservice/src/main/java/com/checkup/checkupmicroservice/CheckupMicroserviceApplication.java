package com.checkup.checkupmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CheckupMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckupMicroserviceApplication.class, args);
	}

}
