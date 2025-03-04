package com.practice.gameDevelopment;

import com.practice.gameDevelopment.game.GameRunner;
import com.practice.gameDevelopment.game.PackmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {
		// 1. Launch a Spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2. Configure the thing that we want spring to manage -
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("personWithMethod"));
		System.out.println(context.getBean("personWithParameters"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("address3"));
	}

}
