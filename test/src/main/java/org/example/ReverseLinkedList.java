package org.example;

public class ReverseLinkedList {
        int value;
            ReverseLinkedList next;
            public ReverseLinkedList(int value) {
                this.value = value;
            }
    // method to reverse the linked list
    public static ReverseLinkedList reverse(ReverseLinkedList head) {
     ReverseLinkedList prev = null;
     ReverseLinkedList current = head;
     ReverseLinkedList next = null;
     while (current!= null) {
         ReverseLinkedList temp = current.next;
         current.next = prev;
         prev = current;
         current = temp;
     }
      return prev;
     }
     //method to find the middle of linkedlist
    public static ReverseLinkedList findMiddle(ReverseLinkedList head) {
        ReverseLinkedList slow = head;
        ReverseLinkedList fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
     // method to print the linked list
    public static void printList(ReverseLinkedList head) {
        ReverseLinkedList current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // create a linked list
        ReverseLinkedList head = new ReverseLinkedList(1);
        head.next = new ReverseLinkedList(2);
        head.next.next = new ReverseLinkedList(3);
        head.next.next.next = new ReverseLinkedList(4);
        head.next.next.next.next = new ReverseLinkedList(5);
        ReverseLinkedList list = reverse(head);
        printList(list);
        ReverseLinkedList middle =findMiddle(list);
        System.out.println();
        System.out.println("Middle element is " + middle.value);





    }
}
