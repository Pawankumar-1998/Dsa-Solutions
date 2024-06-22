package Striver.LinkedList;

import java.util.Stack;

// this is a class that defines the structure of the node
class Node {

    int data ; // this for storing the data
    Node next; // this is for storing the address of the next node

//    constructor for creating the node
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        // creating a linked list and adding the value to it
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

//        printing the list before reversing
            printList(head);
        System.out.println();

//        sending the head address of the link list  to get reversed
        head = reverseLList(head);

//        function for printing the linked list after the reversing the list
        System.out.println("This is after performing the reverse function ");
        printList(head);
    }

    public static void printList(Node head){
        Node temp = head;

        while (temp!=null){

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
//    this is the function for reversing a linked list
    public static Node reverseLList(Node head){
//        pointing the temp to the head of the linked list
            Node temp = head;

        /**
         * we will be using the stack for storing the value
         * then pop the item from the stack inorder to get the reverse list
         * then placing back the item in the linked list
         */

        Stack<Integer> stack = new Stack<>();

//        run this until we reach the end of the linked list
        while (temp!=null){
//            push the data of the current node  into the stack
            stack.push(temp.data);

//            point the temp to the next node
            temp = temp.next;
        }

//        set the temp again back to its head
          temp  = head;

//        put back the value from the stack back to the linked list
        while (temp!=null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
