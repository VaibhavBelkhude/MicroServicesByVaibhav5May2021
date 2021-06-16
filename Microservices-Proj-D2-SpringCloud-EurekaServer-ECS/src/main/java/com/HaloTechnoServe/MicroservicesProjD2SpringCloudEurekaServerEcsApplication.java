package com.HaloTechnoServe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesProjD2SpringCloudEurekaServerEcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProjD2SpringCloudEurekaServerEcsApplication.class, args);
	}

}
