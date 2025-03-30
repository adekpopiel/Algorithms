package linkedlist;
//https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1

public class RotateLinkedList {
    public Node rotate(Node head, int k) {
        Node newHead;
        if (k == 0) {
            return head;
        } else if (head.next == null) {
            return head;
        } else {
            // find the length of the list and assign head as a next to the last elem if necessary
            Node curr = head.next;
            int len = 1;
            while (curr.next != null) {
                curr = curr.next;
                len++;
            }
            len++;
            if (len == k || k%len == 0) {
                return head;
            }
            curr.next = head;
            int jumps = (k%len);

            // find new head and mark its next a null value
            Node nextCurr = head;
            for (int i = 1; i < jumps; i++) {
                nextCurr = nextCurr.next;
            }
            newHead = nextCurr.next;
            nextCurr.next = null;
        }
        return newHead;
    }

    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }
}


