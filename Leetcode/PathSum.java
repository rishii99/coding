public class PathSum {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Recursive method
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // Leaf node check
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Recursive calls
        return hasPathSum(root.left, targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {
        /*
              5
             / \
            4   8
           /
          11
         /
        7
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);

        int targetSum = 27;

        System.out.println(hasPathSum(root, targetSum)); // true
    }
}
