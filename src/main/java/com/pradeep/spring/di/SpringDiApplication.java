package com.pradeep.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pradeep.spring.di.bean.Alien;

@SpringBootApplication
public class SpringDiApplication {
	
	
	private static Alien alien;

	@Autowired
	private void setAlien(Alien alien) {
		SpringDiApplication.alien = alien;
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
		Alien alien1 = context.getBean(Alien.class);
		System.out.println(alien1.getMessage());
		System.out.println(alien.getMessage());
	}

}
