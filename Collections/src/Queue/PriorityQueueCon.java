package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueConcepts {
    public final void waysToIteratePriorityQueue(Queue<Integer> queue) {

    }
}

public class PriorityQueueCon {
    public static void main(String[] args) {
        PriorityQueueConcepts queueConcepts = new PriorityQueueConcepts();
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(20);
        priorityQueue.offer(30);
        priorityQueue.offer(40);
        priorityQueue.offer(50);

        queueConcepts.waysToIteratePriorityQueue(priorityQueue);
    }
}
`