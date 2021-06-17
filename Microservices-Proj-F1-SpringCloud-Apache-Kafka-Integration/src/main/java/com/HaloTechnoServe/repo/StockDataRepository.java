package com.HaloTechnoServe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HaloTechnoServe.model.StockData;

public interface StockDataRepository extends JpaRepository<StockData, Integer> {

}
