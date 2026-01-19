package Lecture16.OOPS.Guess_Game;

public class Game {
    private int ExpectedGuess;
    Player p1,p2,p3;
    Game(String name1,String name2,String name3){
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

     private boolean checkwinner(){
       if (p1.guess == ExpectedGuess && p2.guess == ExpectedGuess && p3.guess == ExpectedGuess){
           System.out.println("Congratulations! All wins!");
           return true;
       } else if (p1.guess == ExpectedGuess && p2.guess == ExpectedGuess) {
           System.out.println("Congratulations! " + p1.name + " and " + p2.name + " wins!");
           return true;
       } else if (p1.guess == ExpectedGuess && p3.guess == ExpectedGuess) {
           System.out.println("Congratulations! " +  p1.name + " and " + p3.name + " wins!");
           return true;
       }else if (p2.guess == ExpectedGuess && p3.guess == ExpectedGuess){
           System.out.println("Congratulations! " + p2.name + " and " + p3.name + " wins!");
           return true;
       } else if (p1.guess == ExpectedGuess) {
           System.out.println("Congratulations! " + p1.name + " wins!");
           return true;
       }else if (p2.guess == ExpectedGuess) {
           System.out.println("Congratulations! " + p2.name + " wins!");
           return true;
       }else if (p3.guess == ExpectedGuess) {
           System.out.println("Congratulations! " + p3.name + " wins!");
           return true;
       }
       return false;
    }
    void StartGame(){
        System.out.println("Game Started!\n Welcome " + p1.name + " , " + p2.name + " , " + p3.name);
        ExpectedGuess = (int)(Math.random()*10);
        System.out.println("Make Your Guess!");
        while (true){
            p1.makeGuess(p1.name);
            p2.makeGuess(p2.name);
            p3.makeGuess(p3.name);
            boolean checkwinner = checkwinner();
            if (checkwinner){
                System.out.println("Game Over!");
                break;
            }
            else {
                System.out.println("Wrong guesses!");
                System.out.println("Guess Again!");
                ExpectedGuess = (int)(Math.random()*10);
            }
        }
    }
}
