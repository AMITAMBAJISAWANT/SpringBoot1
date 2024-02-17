package com.amit.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.amit.springboot1.service1.LaptopService;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springboot1Application.class, args);
		System.out.println("----------------------****************************____________________");
       LaptopService serv=context.getBean(LaptopService.class);
       serv.service();


	// 	Alien a=context.getBean(Alien.class);
	// 	a.compile();


	 }

}
