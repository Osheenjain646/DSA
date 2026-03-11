package LeetCode.LinkedList;

import java.util.HashSet;
import java.util.Scanner;

public class Advance_3 {

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

    public static boolean cycle_Detection1_I(Node head){
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        while (temp!=null){
            if (set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp=temp.next;
        }
        return false;
    }

    public static boolean cycle_Detection1_II(Node head){
        Node fast = head;
        Node slow = head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    public static Node cycle_Detection_2_I(Node head){
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if (fast==slow){
                break;
            }
        }
        if (slow!=fast){
            return null;
        }

        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args){

    }
}
