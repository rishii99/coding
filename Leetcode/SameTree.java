class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        // Case 1: Both trees are empty
        if (p == null && q == null) {
            return true;
        }

        // Case 2: One tree is empty, the other is not
        if (p == null || q == null) {
            return false;
        }

        // Case 3: Values are different
        if (p.val != q.val) {
            return false;
        }

        // Case 4: Check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

    // Optional: main method for testing in VS Code
    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p, q)); // Output: true
    }
}
