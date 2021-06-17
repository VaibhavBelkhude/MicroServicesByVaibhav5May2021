package com.HaloTechnoServe.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HaloTechnoServe.model.StockData;
import com.HaloTechnoServe.service.ProducerService;
import com.HaloTechnoServe.store.MessageStorage;

@RestController
@RequestMapping("/api/stock")
public class StockDataRestController {
	
	@Autowired
	private ProducerService producer;
	
	@Autowired
	private MessageStorage messageStorage;

	@PostMapping("/send")
	public String sendToKafka(
			@RequestBody StockData stockData) 
	{
		producer.sendData(stockData);
		return "SENT SUCCESSFULLY";
	}
	
	@GetMapping("/all")
	public List<StockData> getAllVals() {
		return messageStorage.getAllStockDatas();
	}
}

