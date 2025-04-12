package org.example;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        // this.head=null;
        // this.tail=null;
    }

    public void append(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    //prepend(add node at start)
    public void prepend(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //delete element from linked list
    public void remove(String data)
    {
        Node current = head;
        //if head is null
        if(head == null)
        {
            return;
        }
        //if head is to be removed
        if(head.data==data)
        {
            head=head.next;
            if(head==null)
            {
                tail=null;
            }
        }
        //node we want to delete
        while(current.next!=null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current;
                }
                return;
            }

            current = current.next;
        }

    }

}
