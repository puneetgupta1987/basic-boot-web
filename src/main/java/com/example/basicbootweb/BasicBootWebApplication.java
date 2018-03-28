package com.example.basicbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BasicBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicBootWebApplication.class, args);
	}
}
@RestController
class HelloWorldController{
	@RequestMapping("/")
	String helloWorld(){
		return "HelloWorld";
	}
}
