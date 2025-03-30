package binarytree;

public class MaximumPathSumFromNode {
    int findMaxSum(Node node) {
        int[] res = {node.data};

        findMaxPath(node, res);

        return res[0];
    }

    private int findMaxPath(Node root, int[] res) {
        if (root == null) {
            return 0;
        }

        int l = Math.max(0, findMaxPath(root.left, res));
        int r = Math.max(0, findMaxPath(root.right, res));

        res[0] = Math.max(res[0], l + r + root.data);

        return root.data + Math.max(l, r);
    }
}
