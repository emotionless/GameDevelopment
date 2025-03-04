package com.practice.gameDevelopment;

import com.practice.gameDevelopment.game.GameRunner;
import com.practice.gameDevelopment.game.MarioGame;
import com.practice.gameDevelopment.game.PackmanGame;
import com.practice.gameDevelopment.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class GameDevelopmentApplication {

	public static void main(String[] args) {
		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PackmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
