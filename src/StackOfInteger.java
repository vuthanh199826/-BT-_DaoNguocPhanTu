import java.util.Stack;

public class StackOfInteger {
    public static void main(String[] args) {
        StackOfInteger a = new StackOfInteger();
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            a.stack.push(arr[i]);
        }
        a.display();
        System.out.println("-------------------");
        a.daoNguoc();
        System.out.println("-----------------");
        a.display();
    }

    Stack<Integer> stack;

    public StackOfInteger() {
        stack = new Stack<>();
    }

    public void daoNguoc() {
        int[] arr = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.pop();
            stack.push(arr[i]);
        }

    }

    public void display() {
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
