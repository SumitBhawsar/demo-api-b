package com.capgemini.api.demoapia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApiAApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		try{
			SpringApplication.run(DemoApiAApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoApiAApplication.class);
	}

	@Bean
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}
