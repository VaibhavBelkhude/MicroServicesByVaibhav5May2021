package com.HaloTechnoServe.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	@GetMapping("/pay")
	@HystrixCommand(fallbackMethod = "doDummyPay")
	public String doPayment() {
		System.out.println("ENTERED INTO ACTUAL METHOD");
	
		if(new Random().nextInt(50)<=50 ) {
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



