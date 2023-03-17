package com.tyntec.rockpaperscissors.util;

import com.tyntec.rockpaperscissors.model.Choice;
import java.util.Random;

public class RandomChoiceGeneratorImpl implements RandomChoiceGenerator {
    private Random random;

    public RandomChoiceGeneratorImpl() {
        random = new Random();
    }

    public Choice generateChoice() {
        int choiceIndex = random.nextInt(Choice.values().length);
        return Choice.values()[choiceIndex];
    }
}
