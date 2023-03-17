package com.tyntec.rockpaperscissors.model;

public class Round {
    private int roundId;
    private Game game;
    private Player playerA;
    private Player playerB;
    private int nextChoiceId;

    public Round(int roundId, Game game, Player playerA, Player playerB) {
        this.roundId = roundId;
        this.game = game;
        this.playerA = playerA;
        this.playerB = playerB;
        this.nextChoiceId = 1;
    }

    public int getRoundId() {
        return roundId;
    }

    public Game getGame() {
        return game;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public int getNextChoiceId() {
        int nextId = nextChoiceId;
        nextChoiceId++;
        return nextId;
    }
}
