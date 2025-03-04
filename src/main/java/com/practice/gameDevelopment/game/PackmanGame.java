package com.practice.gameDevelopment.game;

public class PackmanGame implements MyGame {

    @Override
    public void up() {
        System.out.println("Going Up");
    }

    @Override
    public void down() {
        System.out.println("Going down");
    }

    @Override
    public void left() {
        System.out.println("Going Left");
    }

    @Override
    public void right() {
        System.out.println("Going Right");
    }
}
