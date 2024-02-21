package net.kafkaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic kafkaguidesTopic() {
		return TopicBuilder.name("kafkaguides")
				.build();
		
	}
}
