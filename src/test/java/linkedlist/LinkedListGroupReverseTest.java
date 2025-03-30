package linkedlist;

import org.junit.jupiter.api.Test;

import static linkedlist.RotateLinkedList.*;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListGroupReverseTest {

    @Test
    public void testReverseGroup() {
        // head = 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8, k = 4
        Node head = new Node(1);
        Node elem2 = new Node(2);
        Node elem3 = new Node(2);
        Node elem4 = new Node(4);
        Node elem5 = new Node(5);
        Node elem6 = new Node(6);
        Node elem7 = new Node(7);
        Node elem8 = new Node(8);

        head.next = elem2;
        elem2.next = elem3;
        elem3.next = elem4;
        elem4.next = elem5;
        elem5.next = elem6;
        elem6.next = elem7;
        elem7.next = elem8;

        int k = 4;

        Node result = LinkedListGroupReverse.reverseKGroup(head, k);

        assertEquals(elem4, result);
        assertEquals(elem3, result.next);
        assertEquals(elem2, result.next.next);
        assertEquals(head, result.next.next.next);
        assertEquals(elem8, result.next.next.next.next);
        assertEquals(elem7, result.next.next.next.next.next);
        assertEquals(elem6, result.next.next.next.next.next.next);
        assertEquals(elem5, result.next.next.next.next.next.next.next);
        assertNull(result.next.next.next.next.next.next.next.next);


    }
}