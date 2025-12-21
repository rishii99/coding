// public class PathSum {

//     // Definition for a binary tree node
//     static class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;

//         TreeNode(int val) {
//             this.val = val;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     // Recursive method
//     public static boolean hasPathSum(TreeNode root, int targetSum) {
//         if (root == null) {
//             return false;
//         }

//         // Leaf node check
//         if (root.left == null && root.right == null) {
//             return targetSum == root.val;
//         }

//         // Recursive calls
//         return hasPathSum(root.left, targetSum - root.val)
//             || hasPathSum(root.right, targetSum - root.val);
//     }

//     // Main method for testing in VS Code
//     public static void main(String[] args) {
//         /*
//               5
//              / \
//             4   8
//            /
//           11
//          /
//         7
//         */

//         TreeNode root = new TreeNode(5);
//         root.left = new TreeNode(4);
//         root.right = new TreeNode(8);
//         root.left.left = new TreeNode(11);
//         root.left.left.left = new TreeNode(7);

//         int targetSum = 27;

//         System.out.println(hasPathSum(root, targetSum)); // true
//     }
// }


 // Iterative method

 import java.util.Stack;

public class PathSumIterative {

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

    // Iterative method
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // Stack to store nodes
        Stack<TreeNode> nodeStack = new Stack<>();
        // Stack to store corresponding path sums
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.push(root);
        sumStack.push(targetSum);

        while (!nodeStack.isEmpty()) {
            TreeNode current = nodeStack.pop();
            int currentSum = sumStack.pop();

            // Check leaf node
            if (current.left == null && current.right == null && current.val == currentSum) {
                return true;
            }

            // Push right child
            if (current.right != null) {
                nodeStack.push(current.right);
                sumStack.push(currentSum - current.val);
            }

            // Push left child
            if (current.left != null) {
                nodeStack.push(current.left);
                sumStack.push(currentSum - current.val);
            }
        }

        return false;
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
