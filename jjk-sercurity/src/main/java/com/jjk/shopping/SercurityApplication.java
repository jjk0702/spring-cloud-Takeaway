package com.jjk.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class SercurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SercurityApplication.class, args);
	}

}
