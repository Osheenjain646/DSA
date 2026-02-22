package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val , ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class LC2130 {

    public static int Better(ListNode head){
        // slow and fast to find middle and reverse the right part
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr = slow;
        ListNode next;
        ListNode prev =null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        int max = 0;
        ListNode left = head;
        ListNode right = prev;
        while (right!=null){
            int sum = left.val+right.val;
            max=Math.max(max,sum);
            left=left.next;
            right=right.next;
        }
        return max;

    }

    public static int BruteForce(ListNode head){
        // Memory Limit Exceed
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr=head;
        while (curr!=null){
            arr.add(curr.val);
        }
        int[] values = new int[arr.size()];
        for (int i=0; i< values.length; i++){
            values[i]= arr.get(i);
        }
        int max = 0;
        int left =0;
        int right= values.length-1;
        while (left<right){
            int sum=values[left]+values[right];
            max=Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args){

    }
}
