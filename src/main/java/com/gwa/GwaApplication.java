package com.gwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class GwaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GwaApplication.class, args);

	}
}
