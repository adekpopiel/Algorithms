package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateLinkedListTest {

    @Test
    public void testCase1() {
        RotateLinkedList.Node head = new RotateLinkedList.Node(10);
        RotateLinkedList.Node elem1 = new RotateLinkedList.Node(20);
        RotateLinkedList.Node elem2 = new RotateLinkedList.Node(30);
        RotateLinkedList.Node elem3 = new RotateLinkedList.Node(40);
        RotateLinkedList.Node elem4 = new RotateLinkedList.Node(50);

        head.next = elem1;
        elem1.next = elem2;
        elem2.next = elem3;
        elem3.next = elem4;

        RotateLinkedList toTest = new RotateLinkedList();

        RotateLinkedList.Node result = toTest.rotate(head, 4);

        assertEquals(elem4, result);
        assertEquals(head, result.next);
        assertEquals(elem1, result.next.next);
        assertEquals(elem2, result.next.next.next);
        assertEquals(elem3, result.next.next.next.next);
        assertNull(result.next.next.next.next.next);

    }

    @Test
    public void testCase2() {
        RotateLinkedList.Node head = new RotateLinkedList.Node(10);
        RotateLinkedList.Node elem1 = new RotateLinkedList.Node(20);
        RotateLinkedList.Node elem2 = new RotateLinkedList.Node(30);
        RotateLinkedList.Node elem3 = new RotateLinkedList.Node(40);

        head.next = elem1;
        elem1.next = elem2;
        elem2.next = elem3;
        int k = 6;

        RotateLinkedList toTest = new RotateLinkedList();

        RotateLinkedList.Node result = toTest.rotate(head, k);

        assertEquals(elem2, result);
        assertEquals(elem3, result.next);
        assertEquals(head, result.next.next);
        assertEquals(elem1, result.next.next.next);
        assertNull(result.next.next.next.next);


    }


    @Test
    public void testCase3() {
        RotateLinkedList.Node head = new RotateLinkedList.Node(69);
        RotateLinkedList.Node elem2 = new RotateLinkedList.Node(67);
        head.next = elem2;

        int k = 3;

        RotateLinkedList toTest = new RotateLinkedList();

        RotateLinkedList.Node result = toTest.rotate(head, k);

        assertEquals(elem2, result);
        assertEquals(head, result.next);
        assertNull(result.next.next);
    }

}