package com.jcdtfg.arkeositasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
class ArkeositasApiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ArkeositasApiApplication.class);
	}
	static void main(String[] args) {SpringApplication.run(ArkeositasApiApplication.class, args);
	}

}
