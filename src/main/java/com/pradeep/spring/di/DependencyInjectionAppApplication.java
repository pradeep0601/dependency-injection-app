package com.pradeep.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradeep.spring.di.bean.Alien;

@SpringBootApplication
public class DependencyInjectionAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionAppApplication.class, args);
		Alien alien1 = context.getBean(Alien.class);
		System.out.println(alien1.getMessage());
	}

}
