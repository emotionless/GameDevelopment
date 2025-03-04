package com.practice.gameDevelopment;

import com.practice.gameDevelopment.game.GameRunner;
import com.practice.gameDevelopment.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class GameDevelopmentApplication {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
