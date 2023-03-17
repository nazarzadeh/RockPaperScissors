package com.tyntec.rockpaperscissors;

import com.tyntec.rockpaperscissors.model.Choice;
import com.tyntec.rockpaperscissors.model.Game;
import com.tyntec.rockpaperscissors.model.Player;
import com.tyntec.rockpaperscissors.service.RPSGame;
import com.tyntec.rockpaperscissors.service.RPSGameService;
import com.tyntec.rockpaperscissors.util.RandomChoiceGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class RPSGameTest {
    private Player playerA;
    private Player playerB;
    private Game game;
    private RPSGameService rpsGame;

    @Mock
    private RandomChoiceGenerator randomChoiceGenerator;

    @BeforeEach
    public void setUp() {
        playerA = new Player(1, "Player A");
        playerB = new Player(2, "Player B");
        game = new Game(1, playerA, playerB, 10);
        MockitoAnnotations.openMocks(this);
        rpsGame = new RPSGame(game, playerA, playerB, randomChoiceGenerator);
    }

    @Test
    public void testPlayRound_AWins() {
        rpsGame.playRound("Paper", "Rock");
        String expected = """
                Player A wins 1 of 10 games
                Player B wins 0 of 10 games
                Tie: 0 of 10 games""";
        assertEquals(expected, rpsGame.getResults());
    }

    @Test
    public void testPlayRound_BWins() {
        rpsGame.playRound("Paper", "Scissors");
        String expected = """
                Player A wins 0 of 10 games
                Player B wins 1 of 10 games
                Tie: 0 of 10 games""";
        assertEquals(expected, rpsGame.getResults());
    }

    @Test
    public void testPlayRound_Tie() {
        rpsGame.playRound("Paper", "Paper");
        String expected = """
                Player A wins 0 of 10 games
                Player B wins 0 of 10 games
                Tie: 1 of 10 games""";
        assertEquals(expected, rpsGame.getResults());
    }

    @Test
    public void testPlayGame() {
        when(randomChoiceGenerator.generateChoice()).thenReturn(
                Choice.PAPER, Choice.PAPER, Choice.ROCK, Choice.SCISSORS, Choice.ROCK,
                Choice.PAPER, Choice.SCISSORS, Choice.SCISSORS, Choice.ROCK, Choice.PAPER);
        rpsGame.playGame();
        String expected = """
                Player A wins 3 of 10 games
                Player B wins 3 of 10 games
                Tie: 4 of 10 games""";
        assertEquals(expected, rpsGame.getResults());
    }
}
