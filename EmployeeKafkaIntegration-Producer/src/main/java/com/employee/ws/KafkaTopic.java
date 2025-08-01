package com.employee.ws;

import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    NewTopic createTopic() {
			return TopicBuilder.name("new-employee-created-event")
					.partitions(3)
					.replicas(3)
					.configs(Map.of("min.insync.replicas","2"))
					.build();
		}
    
}
