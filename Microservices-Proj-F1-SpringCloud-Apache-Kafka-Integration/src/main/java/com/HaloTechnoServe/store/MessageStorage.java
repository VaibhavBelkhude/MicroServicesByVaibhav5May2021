package com.HaloTechnoServe.store;

import java.util.List;

import org.apache.kafka.common.protocol.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.HaloTechnoServe.model.StockData;
import com.HaloTechnoServe.repo.StockDataRepository;

import jdk.internal.org.jline.utils.Log;

@Component
public class MessageStorage {
	
	private static final Logger LOG = LoggerFactory.getLogger(MessageStorage.class);

	@Autowired
	private StockDataRepository repo;
	
	public void addStockData(StockData sd) {
		sd = repo.save(sd);
		LOG.info("STOCK DATA ADDED TO DATABASE USING MESSAGE STORE WITH ID {}",sd.getId());
	}
	
	public List<StockData> getAllStockDatas() {
		LOG.info("FECHING ALL STOCKS DATA FROM MESSAGE STORE");
		return repo.findAll();
	}
}
