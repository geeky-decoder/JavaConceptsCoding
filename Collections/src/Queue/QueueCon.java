package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class QueueConcepts {

    public static final void queueInterfaceOperations(Queue<Integer> queue) {
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println("------------------");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println("------------------");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println("------------------");

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println("Remaining values: " + iterator.next());
        }
    }
}

public class QueueCon {
    public static void main(String[] args) {
        // normal queue which should be implemented using Linkedlist
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        QueueConcepts queueConcepts = new QueueConcepts();
        queueConcepts.queueInterfaceOperations(queue);
    }
}
