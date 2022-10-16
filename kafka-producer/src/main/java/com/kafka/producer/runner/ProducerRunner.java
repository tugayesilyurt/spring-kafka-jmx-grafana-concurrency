package com.kafka.producer.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kafka.producer.dto.Product;
import com.kafka.producer.service.KafkaProducerService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProducerRunner implements CommandLineRunner {
	
	private final KafkaProducerService service;
	
	@Override
	public void run(String... args) throws InterruptedException {

		    Product product = Product.builder().id(100l).productName("tugay").build();

		    WorkerProduct worker1 = new WorkerProduct(product,service);
		    WorkerProductParallel worker2 = new WorkerProductParallel(product,service);
		    
		    System.out.println("--Thread Name " + Thread.currentThread().getName());

		    worker1.start();
		    worker2.start();

		    System.out.println("--Thread Name " + Thread.currentThread().getName());

		    System.out.println("-----------------------------------------------");
		    System.out.println("-----------------------------------------------");
	}

}
