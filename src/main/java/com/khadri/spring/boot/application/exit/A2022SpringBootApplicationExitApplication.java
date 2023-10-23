package com.khadri.spring.boot.application.exit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class A2022SpringBootApplicationExitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(A2022SpringBootApplicationExitApplication.class, args);
		int code = SpringApplication.exit(applicationContext);
		System.out.println("Exiting Application Context " +code);
		System.exit(code);
	}

}
