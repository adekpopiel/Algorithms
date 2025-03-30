package linkedlist;

import org.junit.jupiter.api.Test;

import static linkedlist.RotateLinkedList.*;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLinkedListsTest {

    @Test
    public void testCase1() {
        //given
        Node head1 = new Node(5);
        Node elem12 = new Node(10);
        Node elem13 = new Node(15);
        Node elem14 = new Node(40);

        head1.next = elem12;
        elem12.next = elem13;
        elem13.next = elem14;

        Node head2 = new Node(2);
        Node elem21 = new Node(3);
        Node elem22 = new Node(20);

        head2.next = elem21;
        elem21.next = elem22;

        //when
        MergeTwoSortedLinkedLists toTest = new MergeTwoSortedLinkedLists();
        Node result = toTest.sortedMerge(head1, head2);

        assertEquals(head2, result);
        assertEquals(elem21, result.next);
        assertEquals(head1, result.next.next);
        assertEquals(elem12, result.next.next.next);
        assertEquals(elem13, result.next.next.next.next);
        assertEquals(elem22, result.next.next.next.next.next);
        assertEquals(elem14, result.next.next.next.next.next.next);
        assertNull(result.next.next.next.next.next.next.next);



    }

    @Test
    public void testCase2() {
        Node head1 = new Node(1);
        Node elem12 = new Node(1);

        head1.next = elem12;

        Node head2 = new Node(2);
        Node elem22 = new Node(4);
        head2.next = elem22;

        //when
        MergeTwoSortedLinkedLists toTest = new MergeTwoSortedLinkedLists();
        Node result = toTest.sortedMerge(head1, head2);

        //then
        assertEquals(head1, result);
        assertEquals(elem12, result.next);
        assertEquals(head2, result.next.next);
        assertEquals(elem22, result.next.next.next);
        assertNull(result.next.next.next.next);

    }

    @Test
    public void testCase3() {
        Node head1 = new Node(42);
        Node elem12 = new Node(61);
        Node elem13 = new Node(91);
        Node elem14 = new Node(95);

        head1.next = elem12;
        elem12.next = elem13;
        elem13.next = elem14;


        Node head2 = new Node(2);
        Node elem22 = new Node(4);
        Node elem23 = new Node(16);
        Node elem24 = new Node(21);
        Node elem25 = new Node(27);
        Node elem26 = new Node(36);
        Node elem27 = new Node(53);
        Node elem28 = new Node(82);
        Node elem29 = new Node(91);
        Node elem210 = new Node(92);

        head2.next = elem22;
        elem22.next = elem23;
        elem23.next = elem24;
        elem24.next = elem25;
        elem25.next = elem26;
        elem26.next = elem27;
        elem27.next = elem28;
        elem28.next = elem29;
        elem29.next = elem210;

        //when
        MergeTwoSortedLinkedLists toTest = new MergeTwoSortedLinkedLists();
        Node result = toTest.sortedMerge(head1, head2);

    }


}