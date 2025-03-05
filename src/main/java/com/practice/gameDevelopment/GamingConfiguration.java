package com.practice.gameDevelopment;

import com.practice.gameDevelopment.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    @Qualifier("packmanGame")
    public MyGame packmanGame() {
        return new PackmanGame();
    }

    @Bean
    @Qualifier("marioGame")
    public MyGame marioGame() {
        return new MarioGame();
    }

    @Bean
    @Qualifier("superContraGame")
    public MyGame superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    public GameRunner gameRunner(@Qualifier("superContraGame") MyGame game) {
        return new GameRunner(game);
    }
}
