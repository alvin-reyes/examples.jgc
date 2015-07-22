package com.areyes1.jgc.junit.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.areyes1.jgc.junit.spring.service.SampleService;
import com.areyes1.jgc.junit.spring.service.SampleServiceImpl;

@Configuration
public class AppConfig {
	@Bean
	public SampleService getSampleService() {
		return new SampleServiceImpl();
	}
}
