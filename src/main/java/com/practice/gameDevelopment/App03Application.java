package com.practice.gameDevelopment;

import com.practice.gameDevelopment.game.GameRunner;
import com.practice.gameDevelopment.game.MyGame;
import com.practice.gameDevelopment.game.PackmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03Application {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext (GamingConfiguration.class)) {
			context.getBean(GameRunner.class).run();
		}
	}
}
