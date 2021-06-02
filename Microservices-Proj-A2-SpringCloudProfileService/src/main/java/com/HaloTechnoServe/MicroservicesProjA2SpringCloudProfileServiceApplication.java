package com.HaloTechnoServe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesProjA2SpringCloudProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProjA2SpringCloudProfileServiceApplication.class, args);
	}

}
