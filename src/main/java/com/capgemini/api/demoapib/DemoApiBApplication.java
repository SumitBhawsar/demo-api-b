package com.capgemini.api.demoapib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApiBApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		try{
			SpringApplication.run(DemoApiBApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApiBApplication.class);
	}
}