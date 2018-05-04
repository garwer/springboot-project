package com.linjw.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LinjwApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(LinjwApplication.class, args);
	}

	/**
	 * 重写
	 * @param builder
	 * @return
	 */
/*	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LinjwApplication.class);
	}*/
}
