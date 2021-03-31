package com.capgemini.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class UsersAppConfig {

	public static void main(String[] args) {
		// to start the spring app
		SpringApplication.run(UsersAppConfig.class, args);

	}

}
