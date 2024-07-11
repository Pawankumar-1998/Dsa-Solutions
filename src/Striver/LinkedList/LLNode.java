package Striver.LinkedList;


/**
 * this class represent the basic structure of the a node in the linked list
 * one part of the node contains the data of the node
 * the another one contains the address of the next node
 */
public class LLNode {
    int data;
    LLNode next;

//      this constructor is used when the user wants to create a empty node with data and the address part are null
    LLNode(){
        this.data = 0;
        this.next = null;
    }
//    this is the constructor that creates a node
    LLNode(int data){
        this.data = data;
        this.next = null;
    }
}
