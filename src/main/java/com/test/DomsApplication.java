package com.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.RabbitListenerErrorHandler;
import org.springframework.amqp.rabbit.support.ListenerExecutionFailedException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@SpringBootApplication
public class DomsApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder().sources(DomsApplication.class)
				.initializers((ApplicationContextInitializer<GenericApplicationContext>) applicationContext -> {
				}).run(args);
	}

}
