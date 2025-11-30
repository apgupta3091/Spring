package com.anuj.learn_spring_framework;

import com.anuj.learn_spring_framework.game.GameRunner;
import com.anuj.learn_spring_framework.game.GamingConsole;
import com.anuj.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
