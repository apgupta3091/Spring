package com.anuj.learn_spring_framework;

import com.anuj.learn_spring_framework.game.GameRunner;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new SuperContraGame();
//        var game = new MarioGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
