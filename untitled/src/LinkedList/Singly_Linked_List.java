package LinkedList;

public class Singly_Linked_List {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;  // default
        }
    }

    public static void TraversalForward(ListNode head){
        if (head==null)return;
        ListNode curr = head;
        while (curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static ListNode deleteFromBeginning(ListNode head){
        if (head==null)return null;;
        return head.next;// safely move the head to next
    }

    public static ListNode deleteFromEnd(ListNode head){
        if (head==null)return null;
        if (head.next==null){
            return null;
        }
        ListNode curr = head;

        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;  // remove the last node

        return head;
    }

    public static ListNode deleteByValue(ListNode head,int key){
        if (head==null)return null;
        if (head.data==key){
            return null;
        }

        ListNode curr = head;
        while (curr.next!=null){
            if (curr.next.data==key){
                curr.next=curr.next.next;
                return head;
            }
            curr=curr.next;
        }
        return head;
    }

    public static boolean search(ListNode head , int key){
        ListNode curr = head;
        while (curr!=null){
            if (curr.data==key){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }

    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode next;
        ListNode curr = head;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }

    public static void main(String[] args){
        ListNode head = null;
        // starting point of the list

        // insert at beginning
        ListNode newNode = new ListNode(45);
        newNode.next=head;
        head=newNode;
        TraversalForward(head);
        // insert at end
        if (head==null){
            head=newNode;
            return;
        }
        ListNode curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        ListNode newNode1 = new ListNode(78);
        curr.next=newNode1;
        TraversalForward(head);

        curr=curr.next;
        ListNode newNode3 = new ListNode(69);
        ListNode newNode4 = new ListNode(6);
        ListNode newNode5 = new ListNode(9);
        ListNode newNode6 = new ListNode(261);

        curr.next=newNode3;
        curr=curr.next;
        curr.next=newNode4;
        curr=curr.next;
        curr.next=newNode5;
        curr=curr.next;
        curr.next=newNode6;
        curr=curr.next;


        //Insert at given position
        int data2=45;
        int pos = 4;

        ListNode insertData = new ListNode(data2);

        if (pos==1){
            insertData.next=head;
            head=insertData;
        }

        ListNode curr1 = head;

        for (int i=1; i<pos-1 && curr1!=null; i++){
            curr1=curr1.next;
        }

        if (curr1==null)return; // invalid position

        insertData.next=curr1.next;
        curr1.next=insertData;
        TraversalForward(head);

        // Insert after a given value
        int key =6;
        int data3=7;
        ListNode curr3 = head;
        while (curr3!=null){
            if (curr3.data==key){
                ListNode newNode7 = new ListNode(data3);
                newNode7.next=curr3.next;
                curr3.next=newNode7;
                break;
            }
            curr3=curr3.next;
        }
        TraversalForward(head);

        // Delete Operation

        // At beginning
        ListNode newhead = deleteFromBeginning(head);
        TraversalForward(newhead);

        // delete At
        // End

        ListNode newhead2=deleteFromEnd(head);
        TraversalForward(head);

        // delete by value
        ListNode newhead3 = deleteByValue(head,6);
        TraversalForward(newhead3);

        System.out.println(search(newhead3,69));
        System.out.println(search(newhead3,454));

        ListNode newHead1 = reverseList(newhead3);
        TraversalForward(newHead1);
    }
}
