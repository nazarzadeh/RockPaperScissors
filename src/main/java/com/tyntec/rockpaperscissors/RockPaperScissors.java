package com.tyntec.rockpaperscissors;

import com.tyntec.rockpaperscissors.model.Game;
import com.tyntec.rockpaperscissors.model.Player;
import com.tyntec.rockpaperscissors.service.RPSGame;
import com.tyntec.rockpaperscissors.util.RandomChoiceGenerator;
import com.tyntec.rockpaperscissors.util.RandomChoiceGeneratorImpl;

public class RockPaperScissors {
    public static void main(String[] args) {
        int totalRounds = 100;
        Player playerA = new Player(1, "Player A");
        Player playerB = new Player(2, "Player B");
        Game game = new Game(1, playerA, playerB, totalRounds);


        RandomChoiceGenerator randomChoiceGenerator = new RandomChoiceGeneratorImpl();
        RPSGame rpsGame = new RPSGame(game, playerA, playerB, randomChoiceGenerator);
        rpsGame.playGame();
        System.out.println(rpsGame.getResults());
    }
}








