package org.example;

public class PalindromeList {
    int data;
    PalindromeList next;

    public PalindromeList(int data) {
        this.data = data;
    }

    public Boolean checkPalindrome(PalindromeList head) {
        PalindromeList fast = head;
        PalindromeList slow = head;
        //to find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next != null) {
            slow = slow.next;
        }
        //reverse the second half of the linked list
        slow = reverse(slow);
        fast = head;
        //compare both halves of the linked list
        while (slow != null) {
            if (slow.data != fast.data) {
                return false;
            }
            fast= fast.next;
            slow = slow.next;
        }
        return true;
    }

    public static PalindromeList reverse(PalindromeList head) {
        PalindromeList prev = null;
        PalindromeList current = head;
        PalindromeList next = null;
        while (current != null) {
            PalindromeList temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        PalindromeList head = new PalindromeList(1);
        head.next = new PalindromeList(2);
        head.next.next = new PalindromeList(3);
        head.next.next.next = new PalindromeList(2);
        head.next.next = new PalindromeList(3);
        Boolean result = head.checkPalindrome(head);
        System.out.println(result);
    }
}
