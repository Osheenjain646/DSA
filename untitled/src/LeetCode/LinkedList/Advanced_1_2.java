package LeetCode.LinkedList;

import java.util.Scanner;

public class Advanced_1_2 {

    public static Node CreateLinkedList(int N){

        Scanner sc = new Scanner(System.in);

        if (N==0){
            return new Node();
        }

        System.out.println("Enter the 1 element of the linked list: ");
        int first = sc.nextInt();
        Node head = new Node(first);
        Node tail = head;
        for (int i=2; i<=N; i++){
            System.out.println("Enter the " + i + " element of the linked list: ");
            int element = sc.nextInt();
            tail.next= new Node(element);
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

    public static int getKthElement(Node head , int k){
//        if (head==null){
//            return -1;
//        }
//        int cnt=0;
//        while (head!=null){
//            cnt++;
//            head=head.next;
//            if (cnt==k){
//                break;
//            }
//        }
//        if (cnt<k){
//            return -1;
//        }
//        return head.data;

        Node t = head;
        if (k>=Length(head)){     // as we are going for indexing so >=
            return -1;
        }
        while (k>0){
            t=t.next;
            k--;
        }
        return t.data;
    }

    public static Node insertAfterKthPosition(Node head , int data , int k){
        if (k>Length(head)){
            return head;
        }

        if (k==0){
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;
            return head;
        }

        Node curr = head;
        for (int i=1; i<k; i++){
            curr=curr.next;
        }
        Node newNode = new Node(data);
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
    }

    public static Node insertSorted(Node head , int data){
        if (head==null){
            return new Node(data);
        }

        Node curr = head;
        Node prev = null;
        while (curr!=null&&curr.data<=data){
            prev = curr;
            curr=curr.next;
        }
        if (curr==head){
            Node newNode = new Node(data);
            newNode.next=curr;
            head=newNode;
            return head;
        }
        if (curr==null){
            prev.next= new Node(data);
            return head;
        }
        Node newNode = new Node(data);
        newNode.next=curr;
        prev.next=newNode;
        return head;
    }

    public static Node reverse(Node head){
        if (head==null || head.next==null){
            return head;
        }

        Node curr = head;
        Node prev =null;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }

    public static Node reverseByk(Node head , int k){
        // Base Case
        if (Length(head)<k){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next;
        int cnt =0;
        while (cnt<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            cnt++;
        }

        if (curr!=null){
            head.next=reverseByk(curr , k);
        }
        return prev;
    }

    public static void main(String[] args){

        // create a linked list
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the linked list: ");
        int size = sc.nextInt();

        Node head = CreateLinkedList(size);

        // print the linked list

        PrintLinkedList(head);

        System.out.println();
        // get Kth Element of the linked list based on indexing not position
//        System.out.println(getKthElement(head , 4));

//        System.out.println();
        // insert at after kth position
//        Node newHead1 = insertAfterKthPosition(head , 6 , 4);

//        PrintLinkedList(newHead1);

        // insert at correct position in sorted linked list

//        Node newHead2 = insertSorted(head , 13);
//        PrintLinkedList(newHead2);

        // reverse the linked list
//        Node newHead3 = reverse(head);
//        PrintLinkedList(newHead3);

        // reverse in k groups
        Node newHead4 = reverseByk(head,3);
        PrintLinkedList(newHead4);
    }
}
