package LeetCode.LinkedList;

class Node{
    int data;
    Node next;
    Node(){};
    Node(int data){
        this.data=data;
        this.next=null;
    }

    Node(int data , Node next){
        this.data=data;
        this.next=next;
    }
}

public class Basics {

    public static Node CreateLinkedList(int N){
        if (N==0){
            return new Node();
        }

        Node head = new Node(1);
        Node tail = head;
        for (int i=2; i<=N; i++){
            tail.next= new Node(i);
            tail = tail.next;
        }

        return head;
    }

    public static void PrintLinkedList(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("" + null);
    }

    public static int Length(Node head){
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static Node insertAtHead(Node head , int data){
        if (head==null){
            return new Node(data);
        }

        Node node = new Node(data);
        node.next=head;
        head=node;
        return head;
    }

    public static Node insertAtTail(Node head , int data){
        if (head==null){
            return new Node(data);
        }

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next=new Node(data);
        return head;
    }

    public static Node insertAtPosition(Node head , int data , int pos){
        // after the position
        if (pos==0){
            return insertAtHead(head,data);
        }
        if (pos>Length(head)){
            return head;
        }
        Node temp = head;
        for (int i=0; i<pos-1; i++){
            temp=temp.next;
        }
        Node newnode = new Node(data);
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }

    public static void main(String[] args){
//        Node n1 = new Node();
//        n1.data=5;
//        Node n2 = new Node();
//        n2.data=7;
//        n1.next=n2;
//        System.out.println(n1.data);
//        System.out.println(n1.next.data);

//        Node n1 = new Node(5);
//        Node n2 = new Node(7);
//        Node n3 = new Node(2);
//        Node n4 = new Node(1);
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=null;
//        System.out.println(n1.data);
//        System.out.println(n1.next.data);
//        System.out.println(n2.next.data);
//        System.out.println(n3.next.data);
//        System.out.println(n4.next);

        // doing head and tail concept

//        Node tail = new Node(5);
//        Node head = tail;
//        tail.next= new Node(7);
//        tail=tail.next;
//        tail.next=new Node(8);
//        tail=tail.next;

        // to avoid repetition task
        // using the loop to do the task

        // loop for N nodes

        Node head = CreateLinkedList(7);
//        PrintLinkedList(head);
//
//        // length count
//        System.out.println("\n"+Length(head));

        // insert at head
        Node newHead = insertAtHead(head , 5);
        PrintLinkedList(newHead);
        System.out.println();
        // insert at end
        Node newHead1 = insertAtTail(head , 8);
        PrintLinkedList(newHead1);

        // insert in the middle of list and given position
        System.out.println();
        Node  newHead2 = insertAtPosition(head , 10 , 5);
        PrintLinkedList(newHead2);

    }
}
