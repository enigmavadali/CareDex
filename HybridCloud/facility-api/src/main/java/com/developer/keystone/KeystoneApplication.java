package com.developer.keystone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration(exclude = RabbitAutoConfiguration.class)
public class KeystoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeystoneApplication.class, args);
	}

}
