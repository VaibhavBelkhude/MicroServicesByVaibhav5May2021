package com.HaloTechnoServe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroservicesProjD1SpringCloudConfigServiceEcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProjD1SpringCloudConfigServiceEcsApplication.class, args);
	}

}
