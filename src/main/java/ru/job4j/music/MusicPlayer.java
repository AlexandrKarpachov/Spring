package ru.job4j.music;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private Map<Style, Music> styles = new HashMap<>();
   

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        styles.put(Style.CLASSICAL, classicalMusic);
        styles.put(Style.POP, popMusic);
        styles.put(Style.ROCK, rockMusic);
    }

    public void playMusic(Style style) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println(styles.get(style).getMusic().get(randomNumber));
    }
	
}
