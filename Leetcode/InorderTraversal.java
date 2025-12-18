import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



public class InorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result;
    }

    // MAIN METHOD (required to run in VS Code)
    public static void main(String[] args) {
        // Example: root = [1, null, 2, 3]
        TreeNode root = new TreeNode(
                1,
                null,
                new TreeNode(2, new TreeNode(3), null)
        );

        System.out.println(inorderTraversal(root)); // [1, 3, 2]
    }
}
