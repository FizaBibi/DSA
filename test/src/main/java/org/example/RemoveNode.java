package org.example;
//delete the nth node from the end of linked list

public class RemoveNode {
   int val;
   RemoveNode next;
    public static RemoveNode removeNthFromEnd(RemoveNode head, int n) {
      RemoveNode slow=head;
      RemoveNode fast=head;

      for(int i=0;i<n;i++)
      {
          fast=fast.next;
      }
      if(fast==null)
      {
          return head.next;
      }
      while(fast!=null && fast.next!=null)
      {
          slow=slow.next;
          fast=fast.next;
      }
      slow.next=slow.next.next;
      return head;
    }
    public static RemoveNode printList(RemoveNode head) {
        while(head!=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
        return head;
    }
    public static void main(String[] args) {
        RemoveNode node1 = new RemoveNode();
        node1.val = 1;
        RemoveNode node2 =   new RemoveNode();
        node2.val = 2;
        RemoveNode node3 = new RemoveNode();
        node3.val = 3;
        RemoveNode node4 = new RemoveNode();
        node4.val = 4;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //print the original linked list
        printList(node1);

        removeNthFromEnd(node1, 2);
        //print the linked list after removing the nth node from the end
        System.out.println("\nAfter removing node");
        printList(node1);
    }
      }
