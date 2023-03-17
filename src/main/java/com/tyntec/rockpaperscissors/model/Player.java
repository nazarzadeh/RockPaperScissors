package com.tyntec.rockpaperscissors.model;

public class Player {
    private int playerId;
    private String name;

    public Player(int playerId, String name) {
        this.playerId = playerId;
        this.name = name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }
}