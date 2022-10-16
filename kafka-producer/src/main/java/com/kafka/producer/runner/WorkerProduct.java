package com.kafka.producer.runner;

import com.kafka.producer.dto.Product;
import com.kafka.producer.service.KafkaProducerService;

public class WorkerProduct extends Thread {

	private KafkaProducerService service;
	private Product product;
	
	public WorkerProduct(Product product,KafkaProducerService service) {
		this.product = product;
		this.service = service;
	} 
	
	@Override
	public void run() {

		System.out.println("--Thread Name WorkerProduct " + Thread.currentThread().getName());
		
		for (int roll = 1; roll <= 1000000; roll++) {
			product.setProductName("tugay");

			if(roll==1000000)
				product.setProductName("last");
				
			service.sendProduct(product);
		}

	}

}
