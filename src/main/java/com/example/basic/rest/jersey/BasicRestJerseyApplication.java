package com.example.basic.rest.jersey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BasicRestJerseyApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(BasicRestJerseyApplication.class, args);
	}

}
