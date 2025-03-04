package com.practice.gameDevelopment.game;

public class GameRunner {
    private MarioGame game;
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Inside Runner");
    }
}
