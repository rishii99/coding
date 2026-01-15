import java.util.Stack;
public class BalancedParenthesis {
    public static void main(String[] args) {
        String expression = "((A+B) + (c-d)";       
        if (isBalanced(expression)) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }
    }
    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
