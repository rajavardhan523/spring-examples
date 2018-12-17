package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Stock;

@Repository
public class StockDAO {
	public void saveStock(Stock stock) {
		//use hibernate to save the data
		System.out.println("Saving the stock");
	}
}
