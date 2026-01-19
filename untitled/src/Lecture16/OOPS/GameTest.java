package Lecture16.OOPS;
import java.util.*;
public class GameTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bruno" , 15 , "Golden Retriever" , "Golden");
//        d1.name="Bruno";
//        d1.age=15;

        Dog d2 = new Dog(); // made with default constructor

        System.out.println(d1.getName()+ " is fighting with " + d2.getName());
        d1.DogIntro();
        d1.celebrateBirthday();
        d2.DogIntro();
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d1.getBreed());
        System.out.println(d1.getColor());
        System.out.println(d2.getName());
        System.out.println(d2.getAge());
        System.out.println(d2.getBreed());
        System.out.println(d2.getColor());
    }
}
