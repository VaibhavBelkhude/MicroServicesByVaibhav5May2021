package com.HaloTechnoServe.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.HaloTechnoServe.model.StockData;
import com.HaloTechnoServe.store.MessageStorage;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ConsumerService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ConsumerService.class);
	
	@Autowired
	private MessageStorage ms;
	
	@KafkaListener(topics = "${my.kafka.app.topic}",groupId = "groupId")
	public void readData(String message) {
		try {
			LOG.info("Consumer got Message !! {}",message);
			// JSON --> Object
			StockData sd = new ObjectMapper()
					.readValue(message, StockData.class);
			
			ms.addStockData(sd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 
