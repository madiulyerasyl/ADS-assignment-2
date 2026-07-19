import java.util.Stack;

public class Task4 {

    static void insertBottom(Stack<Integer> stack, int value) {

        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();

        insertBottom(stack, value);

        stack.push(temp);
    }

    static void reverse(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();

        reverse(stack);

        insertBottom(stack, temp);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(9);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);

        reverse(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}