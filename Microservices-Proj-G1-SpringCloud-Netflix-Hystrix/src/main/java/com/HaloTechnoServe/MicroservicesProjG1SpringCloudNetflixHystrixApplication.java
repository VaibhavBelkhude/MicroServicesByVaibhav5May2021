package com.HaloTechnoServe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class MicroservicesProjG1SpringCloudNetflixHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProjG1SpringCloudNetflixHystrixApplication.class, args);
	}

}
