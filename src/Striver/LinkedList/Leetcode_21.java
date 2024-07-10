package Striver.LinkedList;

public class Leetcode_21 {
    public static void main(String[] args) {
        LLNode list1 = new LLNode(1);
        list1.next = new LLNode(3);
        list1.next.next = new LLNode(5);

        LLNode list2 = new LLNode(2);
        list2.next = new LLNode(4);
        list2.next.next = new LLNode(6);


        LLNode sortedHead = mergeList(list1,list2);
        printLinkedList(sortedHead);
    }

    // Function to print the linked list
    static void printLinkedList(LLNode head) {
        LLNode temp = head;
        while (temp != null) {
            // Print the data of the current node
            System.out.print(temp.data + " ");
            // Move to the next node
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * Solution number : 1
     */

    static LLNode mergeList(LLNode head1 , LLNode head2){
        LLNode temp1 = head1; // for pointing the first list
        LLNode temp2 = head2; // for pointing the second list

        LLNode newHead = new LLNode(-1);
        LLNode temp3 = newHead;

        while (temp1!=null || temp2!=null){
//            if the left list has the smaller value then place the value of the left list in the new array
            if(temp1!=null && temp1.data <= temp2.data){
                temp3.next = new LLNode(temp1.data);
                temp1 = temp1.next;
            } else if (temp2!=null && temp2.data < temp1.data){
//             if the right list has the smaller value place the right list value in the new array
                temp3.next = new LLNode(temp2.data);
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }
        return  newHead.next;
    }
}
