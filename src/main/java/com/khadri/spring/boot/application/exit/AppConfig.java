package com.khadri.spring.boot.application.exit;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return ()-> 34;
	}
	
}
