package com.HaloTechnoServe.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/payment")
public class PaymnentRestController {

	@GetMapping("/pay")
	@HystrixCommand(fallbackMethod = "doDummyPay",
	commandProperties = {
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "6"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000")
	})

	public String doPayment() {
		System.out.println("ENTERED INTO ACTUAL METHOD");

		if(new Random().nextInt(250)<=100 ) {
			throw new RuntimeException("DUMMY EXCEPTION");
		}

		System.out.println("SUCCESFULLY EXECUTED!!");
		return "SUCCESS";
	}

	public String doDummyPay() {
		System.out.println("FROM FALLBACK METHOD");
		return "TRY AFTER SOME TIME!!";
	}
}
