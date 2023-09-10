package org.example;

import org.example.ticTacToe.controllers.GameController;
import org.example.ticTacToe.models.*;
import org.example.ticTacToe.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        try{
            int dimensionOfBoard = 3;

            List<Player> players = new ArrayList<>();
            players.add(new Player((long) 1L, "Aarav",new Symbol('X'), PlayerType.HUMAN));
            players.add(new Bot((long) 2L, "GPT",new Symbol('O'), BotDifficultyLevel.HARD));

            List<WinningStrategy> winningStrategy = new ArrayList<>();
            Game game = gameController.startGame();
        }
        catch (Exception e){
            System.out.println("Something is wrong");
        }
        System.out.println("Game is Created");

    }
}