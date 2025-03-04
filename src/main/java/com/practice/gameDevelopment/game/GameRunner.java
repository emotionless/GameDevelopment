package com.practice.gameDevelopment.game;

public class GameRunner {
    private final MyGame game;
    public GameRunner(MyGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
