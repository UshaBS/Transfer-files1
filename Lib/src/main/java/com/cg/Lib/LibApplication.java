package com.cg.Lib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "com.cg.*")
public class LibApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LibApplication.class, args);
	}
	 
}
