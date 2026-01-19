package lecture13;

public class AlarmTest {

    // Here we have bundled the different type of data inside a single entity (class) that can be used anywhere in the
    // code to access to that different type of data

    static class Alarm{   // It's just like a Driver code to be used in the main function to get the procedure
                          // or the real functionality
        int Current_Time; // Newer DataType for the objects created using the Alarm class in the main function
        int Start_Time;

        void Ring(){
            if (Current_Time==Start_Time){
                System.out.println("Ringing....");
            }
            else {
                System.out.println("The alarm will ring at " + Start_Time);
            }
        }
    }

    public static void main(String[] args) {
        Alarm A = new Alarm();

        // Initialising the value of objects of the class Alarm having the Current_Time and Start_Time as the datatypes
        A.Current_Time=5;
        A.Start_Time=5;
        A.Ring();

        Alarm B = new Alarm();

        B.Current_Time=9;
        B.Start_Time=5;
        B.Ring();

    }
}
