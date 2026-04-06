package Lecture41;

public class StackTest {
    public static void main(String[] args){
        Stack s  = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.push(4);

        // see all the elements

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
