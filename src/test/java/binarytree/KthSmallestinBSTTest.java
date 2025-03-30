package binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestinBSTTest {

    @Test
    public void largeTree() {
        Node root = new Node(20);

        Node l10 = new Node(8);
        root.left = l10;

        Node l20 = new Node(4);
        Node l21 = new Node(12);
        l10.left = l20;
        l10.right = l21;

        Node l31 = new Node(10);
        Node l32 = new Node(14);

        l21.left = l31;
        l21.right = l32;

        Node r10 = new Node(22);
        root.right = r10;

        KthSmallestinBST toTest = new KthSmallestinBST();
        int result = toTest.kthSmallest(root, 3);

        assertEquals(10, result);
    }

    @Test
    public void onlyRoot() {
        Node root = new Node(1);
        int k = 15;
        KthSmallestinBST toTest = new KthSmallestinBST();
        int result = toTest.kthSmallest(root, k);

        assertEquals(-1, result);

    }
}