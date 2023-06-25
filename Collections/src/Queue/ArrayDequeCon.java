package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class ArrayDequeConcepts {
    public final void useArrayDequeAsStack() {
        Deque<Integer> stackDeque = new ArrayDeque<>();
        stackDeque.offerFirst(10);
        stackDeque.offerFirst(20);
        stackDeque.offerFirst(30);
        System.out.println(stackDeque); // 30 will be at first followed by 20 & 10 (LIFO)

        stackDeque.pollFirst();
        System.out.println(stackDeque); // 30 will be removed because it's a LIFO.
        System.out.println(stackDeque.peekFirst()); // Gives the top/first element from the Stack
    }

    public final void useArrayDequeAsQueue() {
        Deque<Integer> queueDeque = new ArrayDeque<>();
        queueDeque.offerLast(10);
        queueDeque.offerLast(20);
        queueDeque.offerLast(30);
        System.out.println(queueDeque); // 30 will be at last (FIFO)

        queueDeque.pollFirst();
        System.out.println(queueDeque); // 30 will be removed because it's a FIFO.
        System.out.println(queueDeque.peekFirst()); // Gives the top/first element from the Queue
    }
}

public class ArrayDequeCon {
    public static void main(String[] args) {
        ArrayDequeConcepts queueConcepts = new ArrayDequeConcepts();

        queueConcepts.useArrayDequeAsStack();
        queueConcepts.useArrayDequeAsQueue();
    }
}
