package Lecture41;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Stack {
    Node head;
    Stack(){
        head=null;
    }

    void push(int data){
        if (head==null){
            head=new Node(data);
        }else {
            Node n = new Node(data);
            n.next=head;
            head=n;
        }
    }

    void pop(){
        if (head!=null){
            head=head.next;
        }
    }

    int peek(){
        return head.data;
    }

    boolean isEmpty(){
        return head==null;
    }
}
