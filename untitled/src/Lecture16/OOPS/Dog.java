package Lecture16.OOPS;

public class Dog {
    private String name;
    private int age;
    private String Breed;
    private String color;

    // Special function (constructor) -> for constructing objects
    Dog(){
        System.out.println(" Default Dog Constructor called");
        setName("Jack");
        setAge(1);
        setBreed("Pug");
        setColor("Black");
    }

    Dog(String name, int age, String Breed, String color) {
        System.out.println("Dog Constructor with parameters called");
        setName(name);
        setAge(age);
        setBreed(Breed);
        setColor(color);
    }

    void DogIntro(){
        System.out.println("Hi, I am " + this.name + " and I am " + this.age + " years old.\n" + this.color + " in color of breed " + this.Breed);

    }

    //getter
    int getAge(){
        return  age;
    }

    //setter
    void setAge(int age){
        if (age>=1){
            this.age = age;
        }else {
            System.out.println("Invalid Age Entered");
        }
    }

    void celebrateBirthday(){
        System.out.println("Happy Birthday " + this.name);
        age+=1;
    }

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return color;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setBreed(String Breed){
        this.Breed = Breed;
    }

    String getBreed(){
        return Breed;
    }

}
