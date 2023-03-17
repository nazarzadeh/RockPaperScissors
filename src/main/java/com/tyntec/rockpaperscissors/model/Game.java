package com.tyntec.rockpaperscissors.model;

public class Game {
    private int gameId;
    private Player playerA;
    private Player playerB;
    private int totalRounds;
    private int nextRoundId;

    public Game(int gameId, Player playerA, Player playerB, int totalRounds) {
        this.gameId = gameId;
        this.playerA = playerA;
        this.playerB = playerB;
        this.totalRounds = totalRounds;
        this.nextRoundId = 1;
    }

    public int getGameId() {
        return gameId;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    public int getNextRoundId() {
        int nextId = nextRoundId;
        nextRoundId++;
        return nextId;
    }
}
