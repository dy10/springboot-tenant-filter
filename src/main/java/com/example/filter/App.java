package com.example.filter;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	
	@PostConstruct
	public void init() {
		try {
			Thread.sleep(10000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }
}
