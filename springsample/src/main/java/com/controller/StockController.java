package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Stock;
import com.service.StockService;

@Component(value="stockControllerBean")
public class StockController {
	@Autowired
	private StockService service = null;

	public StockController() {
		super();
	}

	public StockController(StockService service) {
		super();
		System.out.println("Setting the stock service using constructor");
		this.service = service;
	}

	public void saveStockRequest(Stock stock) {
		System.out.println("Calling Service to save stock");
		service.saveStock(stock);
	}

	public StockService getService() {
		return service;
	}

	public void setService(StockService service) {
		System.out.println("Setting the stock service using setter");
		this.service = service;
	}
}
