package Lecture16.OOPS.Guess_Game;

import java.util.Scanner;

public class Player {
    String name;
    int guess;
    Scanner sc =new Scanner(System.in);
    Player(String name){
        this.name=name;
    }

    void makeGuess(String name) {
        System.out.print(name + ": ");
        guess = sc.nextInt();
    }
}
