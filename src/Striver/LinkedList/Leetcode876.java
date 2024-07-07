package Striver.LinkedList;


public class Leetcode876 {
    public static void main(String[] args) {
        LLNode head = new LLNode(10);
        head.next = new LLNode(20);
        head.next.next = new LLNode(30);
        head.next.next.next = new LLNode(40);
        head.next.next.next.next = new LLNode(50);




//       head =  middleOfList(head);
        head = rabbitHaze(head);
       printLL(head);

    }

//    this is the default function for printing thr linked list
    static void printLL(LLNode head){
        LLNode temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /**
     * Optimal solution :- where we will be using the rabbit and the haze algorithm so that we can find the middle
     * of the element in a single go
     * every time rabbit moves two steps the haze will move only one step
     * when the rabbit reaches the end of the list the haze will be at the middle of the list
     */

    static LLNode rabbitHaze(LLNode head){
        LLNode fast = head; // fast pointer represents the rabbit
        LLNode slow = head; // slow pointer represents the haze

        int series = 1;

//         until the fast reaches the end of the list traverse the whole list
        while (fast!=null){
            series++;
            if (series % 2==1){
                slow = slow.next;
            }
            fast = fast.next;
        }
        return slow.next;
    }

    /**
 * brute force solution to find the middle of the linked list
 */
    static LLNode middleOfList(LLNode head){
        LLNode temp = head;
        int count = 0; // this for the size the linked list

        while (temp !=null){
            count +=1;
            temp = temp.next;
        }
//  divide the length by 2 to get the middle of the list
        int mid =  (count / 2 ) + 1;
//        point the temp again back to head
        temp = head;

        for (int i = 0; i < mid-1; i++) {
            temp = temp.next;
        }
        return temp;


    }

}
