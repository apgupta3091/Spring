package com.anuj.learn_spring_framework;

import com.anuj.learn_spring_framework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //Configure the context
        System.out.println(context.getBean("name"));
    }
}
