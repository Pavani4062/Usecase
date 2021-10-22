package com.example.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
    public String test1() {
    	return "test1 method of service1";
    }
    public String test2() {
    	return "test2 method of service1";
    }
}
