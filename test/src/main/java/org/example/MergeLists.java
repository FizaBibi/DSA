package org.example;
import java.util.ArrayList;
public class MergeLists {
    int value;
    MergeLists next;
    public static MergeLists merge(MergeLists list1, MergeLists list2) {
        MergeLists prehead=new MergeLists();
        MergeLists current=prehead;
        while(list1!=null && list2!=null)
        {
            int val1=list1.value;
            int val2=list2.value;
            if(val1<=val2)
            {
               current.next=list1;
               list1=list1.next;
            }
            else
            {
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
            }
        current.next=list1!=null?list1:list2;
           return prehead.next;
        }
    public static void printList(MergeLists head) {
        MergeLists current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
            int[] list1 = {1, 3, 5, 7};
            int[] list2 = {2, 4, 6, 8};
            MergeLists head1 = new MergeLists();
            MergeLists head2 = new MergeLists();
            MergeLists current1 = head1;
            MergeLists current2 = head2;
            for (int i = 0; i < list1.length; i++) {
                current1.value = list1[i];
                current1.next = new MergeLists();
                current1 = current1.next;
            }
            current1 = head1;
            for (int i = 0; i < list2.length; i++) {
                current2.value = list2[i];
                current2.next = new MergeLists();
                current2 = current2.next;
            }
            current2 = head2;
            MergeLists mergedList = merge(head1, head2);
            printList(mergedList);
            }
        }

