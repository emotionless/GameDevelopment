package com.practice.gameDevelopment.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean
    @Primary
    public Person person3WithParameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person4WithQualifier(String name, int age, @Qualifier("address2Qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean (name = "address2")
    @Qualifier("address2Qualifier")
    public Address address() {
        return new Address("610 Granville St, BC, Canada", "Vancouver");
    }

    @Bean (name = "address3")
    @Primary
    public Address address3() {
        return new Address("Haydarabad", "Gazipur");
    }
}
