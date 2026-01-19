package Lecture16.OOPS.Guess_Game;

import Lecture16.OOPS.GameTest;

import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Guess Game!");
        System.out.println("Enter the name of the three players");
        System.out.print("Player 1: ");
        String player1 = sc.nextLine();
        System.out.print("Player 2: ");
        String player2 = sc.nextLine();
        System.out.print("Player 3: ");
        String player3 = sc.nextLine();

        Game game = new Game(player1,player2,player3);
        game.StartGame();

    }
}
