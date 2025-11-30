package com.anuj.learn_spring_framework;

import com.anuj.learn_spring_framework.game.GameRunner;
import com.anuj.learn_spring_framework.game.GamingConsole;
import com.anuj.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringJava {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
