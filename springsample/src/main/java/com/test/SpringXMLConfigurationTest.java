package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.StockController;
import com.model.Stock;

public class SpringXMLConfigurationTest {
	public static void main(String[] args) {
		System.out.println("Instantiating Spring using XML");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		System.out.println("Finished Instanting Spring");
		System.out.println("Getting the stock controller from spring context");
		
		StockController stockController =	(StockController) context.getBean("stockControllerBean");
		
		Stock stock = new Stock();
		
		stockController.saveStockRequest(stock);
		
		System.out.println("Prototype example");
		System.out.println("Getting the stock controller from spring context");
		
		stockController =	(StockController) context.getBean("stockControllerBean");
		
		stock = new Stock();
		
		stockController.saveStockRequest(stock);
		
		System.out.println("Finished Instantiating Spring using XML");
	}
}
