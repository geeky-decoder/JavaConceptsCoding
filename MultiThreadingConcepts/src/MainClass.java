public class MainClass {
    public static void main(String[] args) throws Exception {

        // creating common object for both the consumer and producer threads
        SharedResourceClass sharedResourceClass = new SharedResourceClass();

        // creating thread for producer using lambda expression and calling its run()
        // method
        Thread producerThread = new Thread(() -> {
            try {
                // used timed waiting to make it wait so that consumer thread can run first
                Thread.sleep(4000);
            } catch (Exception exception) {
                // handle this
            }

            sharedResourceClass.addItem();
        });

        // creating thread for consumer using lambda expression and calling its run()
        // method
        Thread consumerThread = new Thread(() -> sharedResourceClass.consumeItem());

        producerThread.start();

        consumerThread.start();

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        /*
         * PRODUCER-CONSUMER PROBLEM
         */
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        ProducerConsumerProblem producerConsumerProblem = new ProducerConsumerProblem(4);

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                producerConsumerProblem.producer();
            }
        });

        Thread consumer = new Thread(() -> {
            for (int j = 0; j < 5; j++) {
                producerConsumerProblem.consumer();
            }
        });

        producer.start();
        consumer.start();
    }
}
