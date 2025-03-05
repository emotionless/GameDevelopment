package com.practice.gameDevelopment;

import com.practice.gameDevelopment.game.GameRunner;
import com.practice.gameDevelopment.game.PackmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

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
		System.out.println(context.getBean("person3WithParameters"));
		System.out.println(context.getBean("person4WithQualifier"));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("address3"));
		System.out.println(context.getBean(Address.class));

		// prints all beans
		Arrays.stream(context.getBeanDefinitionNames()).forEach(
				System.out::println
		);
	}

}
