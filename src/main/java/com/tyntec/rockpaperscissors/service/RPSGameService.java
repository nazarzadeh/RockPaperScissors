package com.tyntec.rockpaperscissors.service;

public interface RPSGameService {
    void playGame();
    void playRound(String playerAChoice, String playerBChoice);
    String getResults();
}
