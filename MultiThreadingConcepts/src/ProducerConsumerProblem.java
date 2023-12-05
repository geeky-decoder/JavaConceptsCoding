import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerProblem {

    private int queueSize;
    private Queue<Integer> buffQueue = new LinkedList<>();

    public ProducerConsumerProblem(int queueSize) {
        this.queueSize = queueSize;
    }

    public synchronized void producer() {
        Random random = new Random();
        System.out.println("Inside Producer");
        try {

            while (buffQueue.size() == queueSize) {
                System.out.println("Inside Producer, queue is full");
                wait();
                System.out.println("Inside Producer, item added after wait");
            }

            System.out.println("Inside Producer, producing item");
            buffQueue.add(random.nextInt(10));
            notifyAll();
        } catch (Exception exception) {
            // handle
        }
    }

    public synchronized void consumer() {
        System.out.println("Inside Consumer");
        try {
            while (buffQueue.isEmpty()) {
                System.out.println("Inside Consumer, queue is empty");
                wait();
                System.out.println("Inside Consumer, item consumed after wait");
            }

            System.out.println("Inside Consumer, consuming item");
            buffQueue.poll();
            notifyAll();
        } catch (Exception exception) {
            // handle
        }
    }
}
