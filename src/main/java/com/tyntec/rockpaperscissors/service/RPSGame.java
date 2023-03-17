package com.tyntec.rockpaperscissors.service;

import com.tyntec.rockpaperscissors.model.Choice;
import com.tyntec.rockpaperscissors.model.Game;
import com.tyntec.rockpaperscissors.model.Player;
import com.tyntec.rockpaperscissors.util.RandomChoiceGenerator;

public class RPSGame implements RPSGameService {
    private Game game;
    private Player playerA;
    private Player playerB;
    private RandomChoiceGenerator randomChoiceGenerator;
    private int playerAScore;
    private int playerBScore;
    private int ties;

    public RPSGame(Game game, Player playerA, Player playerB, RandomChoiceGenerator randomChoiceGenerator) {
        this.game = game;
        this.playerA = playerA;
        this.playerB = playerB;
        this.randomChoiceGenerator = randomChoiceGenerator;
        this.playerAScore = 0;
        this.playerBScore = 0;
        this.ties = 0;
    }

    public void playGame() {
        for (int i = 0; i < game.getTotalRounds(); i++) {
            Choice choiceA = Choice.PAPER;
            Choice choiceB = randomChoiceGenerator.generateChoice();

            determineWinner(choiceA, choiceB);
        }
    }

    public void playRound(String playerAChoice, String playerBChoice) {
        Choice choiceA = Choice.valueOf(playerAChoice.toUpperCase());
        Choice choiceB = Choice.valueOf(playerBChoice.toUpperCase());

        determineWinner(choiceA, choiceB);
    }

    public String getResults() {
        return "Player A wins " + playerAScore + " of " + game.getTotalRounds() + " games\n" +
                "Player B wins " + playerBScore + " of " + game.getTotalRounds() + " games\n" +
                "Tie: " + ties + " of " + game.getTotalRounds() + " games";
    }

    private void determineWinner(Choice choiceA, Choice choiceB) {
        if (choiceA == choiceB) {
            ties++;
        } else if ((choiceA == Choice.ROCK && choiceB == Choice.SCISSORS) ||
                (choiceA == Choice.PAPER && choiceB == Choice.ROCK) ||
                (choiceA == Choice.SCISSORS && choiceB == Choice.PAPER)) {
            playerAScore++;
        } else {
            playerBScore++;
        }
    }
}
