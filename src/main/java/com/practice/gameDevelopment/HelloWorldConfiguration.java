package com.practice.gameDevelopment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { };
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Faruk";
    }

    @Bean
    public int age() {
        return 21;
    }

    @Bean
    public Person person() {
        var person = new Person("Milon", 23, new Address("Ampang", "KL"));
        return person;
    }

    @Bean
    public Person personWithMethod() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person personWithParameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean (name = "address2")
    public Address address() {
        return new Address("610 Granville St, BC, Canada", "Vancouver");
    }

    @Bean (name = "address3")
    public Address address3() {
        return new Address("Haydarabad", "Gazipur");
    }
}
