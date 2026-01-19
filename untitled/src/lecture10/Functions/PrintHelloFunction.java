package lecture10.Functions;

// As functions are reusable we can call them many times

public class PrintHelloFunction {

    // Define function
    public static void sayHello(){
        System.out.println("Hello from function sayHello");
    }

    public static void Hellonameinput(String name){
        System.out.println("Hello "+name);
    }

    public static void add(int a,int b){
        System.out.println("Sum: " + (a+b));
    }

    public static void main(String[] args) {
        sayHello();   // Calling the sayHello function to print their data or use their data
        Hellonameinput("Osheen Jain");
        Hellonameinput("Anurag Raj");
        Hellonameinput("Manoj Verma");
        add(26,565);
        System.out.println("Thank You");
    }
}
