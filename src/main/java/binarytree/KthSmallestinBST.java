package binarytree;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthSmallestinBST {
    public int kthSmallest(Node root, int k) {
        int result = kthPreOrder(root, new ArrayList<Integer>(), k);
        return result;
    }

    private int kthPreOrder(Node root, ArrayList<Integer> listOfElements, int k) {
        if (k == listOfElements.size()) {
            return listOfElements.get(listOfElements.size()-1);
        } else if (root == null) {
            return -1;
        }
        int leftResult = kthPreOrder(root.left, listOfElements, k);

        if (leftResult != -1) {
            return leftResult;
        }
        listOfElements.add(root.data);

        int rightResult = kthPreOrder(root.right, listOfElements, k);

        if (rightResult != -1) {
            return rightResult;
        }
    return -1;
    }
}
