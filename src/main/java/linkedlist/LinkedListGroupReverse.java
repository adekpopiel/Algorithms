package linkedlist;

import static linkedlist.RotateLinkedList.*;

//https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
public class LinkedListGroupReverse {
    public static Node reverseKGroup(Node head, int k) {
        if (head == null) {
            return head;
        }

        Node curr = head;
        Node newHead = null;
        Node tail = null;

        Node groupHead = curr;
        while(curr != null) {
            int counter = 0;
            Node prev = null;
            Node next = curr.next;
            Node candidateTail = null;
            while(curr != null && counter < k) {
                next = curr.next;
                curr.next = prev;
                if (counter == 0) {
                    candidateTail = curr;
                }
                prev = curr;
                curr = next;
                counter++;
            }

            if (newHead == null) {
                newHead = prev;
            }
            groupHead = prev;
            if (tail != null) {
                tail.next = groupHead;
            }
            tail = candidateTail;
        }
        return newHead;
    }
}
