package com.finwise.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FinwiseDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinwiseDiscoveryServerApplication.class, args);
	}

}
