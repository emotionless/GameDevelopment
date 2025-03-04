package com.practice.gameDevelopment.game;

public class MarioGame implements MyGame {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Put in a hole");
    }

    @Override
    public void left() {
        System.out.println("Back");
    }

    @Override
    public void right() {
        System.out.println("Accelerate");
    }
}
