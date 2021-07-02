package com.HaloTechnoServe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesProjG1SpringCloudNetflixHystrixEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProjG1SpringCloudNetflixHystrixEurekaServerApplication.class, args);
	}

}
