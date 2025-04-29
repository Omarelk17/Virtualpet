package com.virtualpet.Virtualpet.component;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MoodGenerator {

    private static final String[] moods = {"Happy", "Sleepy", "Hungry", "Playful", "Excited"};
    private final Random random = new Random();

    public String getRandomMood() {
        int index = random.nextInt(moods.length);
        return moods[index];
    }
}
