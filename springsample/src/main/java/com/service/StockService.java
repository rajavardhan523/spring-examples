package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StockDAO;
import com.model.Stock;

@Service
public class StockService {
	@Autowired
	private StockDAO stockDAO = null;

	public void saveStock(Stock stock) {
		System.out.println("Applying business logic to stock");
		//business logic
		
		//save the data
		System.out.println("Calling DAO to save stock");
		stockDAO.saveStock(stock);
	}

	public StockDAO getStockDAO() {
		return stockDAO;
	}

	public void setStockDAO(StockDAO stockDAO) {
		this.stockDAO = stockDAO;
	}
}
