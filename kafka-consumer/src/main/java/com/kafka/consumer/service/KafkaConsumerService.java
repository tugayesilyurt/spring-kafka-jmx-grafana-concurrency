package com.kafka.consumer.service;

import java.time.LocalDateTime;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.kafka.consumer.dto.Product;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "product-topic", containerFactory = "kafkaListenerContainerFactoryProduct", groupId = "consumerFactoryProduct")
	public void consumer(@Payload Product message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
			@Header(KafkaHeaders.OFFSET) String offset) throws InterruptedException {

		if (message.getProductName().equals("last")) {
			System.out.println("");
			System.out.println("1 PARTITION Finish Time : " + LocalDateTime.now());
		}

	}

	@KafkaListener(topics = "product-topic-parallel", containerFactory = "kafkaListenerContainerFactoryProductParallel", groupId = "consumerFactoryProductParallel", concurrency = "10")
	public void consumerParallel(@Payload Product message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
			@Header(KafkaHeaders.OFFSET) String offset) throws InterruptedException {

		if (message.getProductName().equals("last")) {
			System.out.println("");
			System.out.println("10 PARTITION Finish Time : " + LocalDateTime.now());
		}

	}

}
