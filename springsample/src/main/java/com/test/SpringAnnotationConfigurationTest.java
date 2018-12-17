package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.StockController;
import com.model.Stock;

public class SpringAnnotationConfigurationTest {
	public static void main(String[] args) {
		System.out.println("Instantiating Spring using Annotations");
		ApplicationContext context = new AnnotationConfigApplicationContext("com");
		System.out.println("Finished Instanting Spring");
		System.out.println("Getting the stock controller from spring context");
		
		StockController stockController = (StockController) context.getBean("stockControllerBean");

		Stock stock = new Stock();

		stockController.saveStockRequest(stock);

		System.out.println("Finished Instantiating Spring using Annotations");
	}
}
