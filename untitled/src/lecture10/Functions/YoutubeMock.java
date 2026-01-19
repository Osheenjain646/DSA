package lecture10.Functions;

import java.util.Objects;
import java.util.Scanner;

public class YoutubeMock {

    //Pass by value -> data will be copied when a fn is called in a new variable as P here having the value of Password

    // No pass by reference exist in java

    public static boolean loginInfoCheck(String P){
        // Checking the Password entered with already stored password
        return Objects.equals(P, "Osheen456jain552");
    }

    private static void vedioupload(String vedioname) {
        System.out.println(vedioname + " uploaded successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String Username = sc.nextLine();
        System.out.println("Enter the password: ");
        String Password = sc.nextLine();
        System.out.println("Enter the name of the video to be uploaded: ");
        String videoname = sc.nextLine();
        if (loginInfoCheck(Password)) {
            vedioupload(videoname);
        } else {
            System.out.println("incorrect password!\nlogin Again");
        }
    }
}
