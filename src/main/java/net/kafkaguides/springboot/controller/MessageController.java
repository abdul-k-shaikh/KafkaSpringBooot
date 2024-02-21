package net.kafkaguides.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kafkaguides.springboot.kafka.KafkaProducer;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {
	private KafkaProducer kafkaProducer;
	
}
