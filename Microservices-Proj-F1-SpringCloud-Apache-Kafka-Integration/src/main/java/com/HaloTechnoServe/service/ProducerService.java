package com.HaloTechnoServe.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.HaloTechnoServe.model.StockData;

@Service
public class ProducerService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProducerService.class);
	
	@Value("${my.kafka.app.topic}")
	private String topic;

	@Autowired
	private KafkaTemplate<String, String> template;
	
	public void sendData(StockData stockData) {
		LOG.info("SENDING MESSAGE TO KAFKA");
		try {
			template.send(topic, 
					new ObjectMapper()
					.writeValueAsString(stockData)
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOG.info("SENT SUCCESFULLY");
	}
}
