package Striver.LinkedList.Average;

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

//        printing the list before the reversing the list
//        printingLList(head);

//        printing the list after the reversing the linked list
        reverseTheList(head);
    }

//    function for printing the linked list
    static void printingLList(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

//    function for reversing the linked list optimally by just changing the direction of the connection
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
