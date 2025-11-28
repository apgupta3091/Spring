package com.anuj.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) { };
record Address(String streetName, String city) { };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "ranga";
    }

    @Bean
    public int age() {
        return 26;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20, new Address("Street Ave", "Jersey City"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Park Ave", "Hoboken");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("Motinager", "Hydrabad");
    }
}
