package com.qubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class SqsListenerTestApplication {
	
	private static Logger LOG = LoggerFactory.getLogger(SqsListenerTestApplication.class);
	
	@SqsListener("netsurfingzone-first-sqs")
	public void listen(String message) {
		LOG.info("!!!! received message {}", message);
	}

	public static void main(String[] args) {
		SpringApplication.run(SqsListenerTestApplication.class, args);
	}

}
