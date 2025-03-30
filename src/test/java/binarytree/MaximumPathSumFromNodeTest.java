package binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumPathSumFromNodeTest {

    @Test
    public void testPathPassingRoot() {

        Node root = new Node(10);

        Node l20 = new Node(20);
        Node l21 = new Node(1);

        Node l10 = new Node(2);
        l10.left = l20;
        l10.right = l21;

        root.left = l10;

        Node r30 = new Node(3);
        Node r31 = new Node(4);

        Node r20 = new Node(-25);
        r20.left = r30;
        r20.right = r31;

        Node r10 = new Node(10);
        r10.right = r20;

        root.right = r10;

        MaximumPathSumFromNode toTest = new MaximumPathSumFromNode();
        int result = toTest.findMaxSum(root);

        assertEquals(42, result);

    }

}