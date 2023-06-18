package Queue;

import java.util.Iterator;
import java.util.Stack;

class StackConcepts {

    public static final void stackClassOperations(Stack<Integer> stack) {
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("------------------");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("------------------");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("------------------");

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println("Remaining values: " + iterator.next());
        }
    }
}

public class StackCon {
    public static void main(String[] args) {
        // normal stack which should be implemented using Stack Class
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        StackConcepts stackConcepts = new StackConcepts();
        stackConcepts.stackClassOperations(stack);
    }
}
