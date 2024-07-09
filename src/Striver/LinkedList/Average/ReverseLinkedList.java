package Striver.LinkedList.Average;

/**
    this is the basic structure of the node where the data is to be stored
 */
class ListNode {
    int val;
    ListNode next;


//    constructor for creating the object
    ListNode(int data){
        this.val = data;
        this.next = null;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
//        creating the linked list
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        // calling Approach number 3
        head = reverseListRecursive(head);
        printingLList(head);
    }

//    function for printing the linked list
    static void printingLList(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    /**
     * Approach 3: in this approach we will be using recursion
     */
    static ListNode reverseListRecursive(ListNode head){
//        base case : if the size of the list is null or contain only single element the simply return it
        if(head == null || head.next == null){
            return head;
        }

//        get the new head pointer from the below call
        ListNode newHead = reverseListRecursive(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }


    /**
     *Approach 2 : in this approach we just change the direction of the connection and point the head toward the last / tail
     * node at the end
     */
    static void reverseTheList(ListNode head){
        ListNode prev = null;
        ListNode temp = head;

        while (temp!=null){
//            assign the node to the right of the initial node
            ListNode front = temp.next;
            /**
             * change the direction of the connection of the linked list and shift the head towards the tail
             */
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = prev;
        printingLList(head);
    }
}
