package linkedlist;

import static linkedlist.RotateLinkedList.*;

//https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
public class MergeTwoSortedLinkedLists {

    Node sortedMerge(Node head1, Node head2) {
        Node newHead;
        Node p1 = head1;
        Node p2 = head2;

        //initialise new head
        if (p1.data < p2.data) {
            newHead = p1;
            p1 = p1.next;
        } else {
            newHead = p2;
            p2 = p2.next;
        }
        Node curr = newHead;
        while (p1 != null || p2 != null) {
            if (p1 == null ||  (p2 != null && p2.data < p1.data)) {
                curr.next = p2;
                p2 = p2.next;
            } else if (p2 == null || (p1 != null && p1.data <= p2.data)) {
                curr.next = p1;
                p1 = p1.next;
            }
            curr = curr.next;
        }

        return newHead;
    }
}
