package com.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class DomsApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder().sources(DomsApplication.class)
				.initializers((ApplicationContextInitializer<GenericApplicationContext>) applicationContext -> {
				}).run(args);
	}

}
