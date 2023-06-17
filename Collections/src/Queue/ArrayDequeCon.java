package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

class ArrayDequeConcepts {
    public final void waysToIterateArrayDeque(Queue<Integer> queue) {

    }
}


public class ArrayDequeCon {
    public static void main(String[] args) {
        ArrayDequeConcepts queueConcepts = new ArrayDequeConcepts();
        Queue<Integer> arraQueue = new ArrayDeque<>();
        arraQueue.offer(10);
        arraQueue.offer(20);
        arraQueue.offer(30);
        arraQueue.offer(40);
        arraQueue.offer(50);

        queueConcepts.waysToIterateArrayDeque(arraQueue);
    }
}
