public class JoinDaemonPriorityInThread {

    public void randomMethod() {
        try {
            System.out.println("Lock acquired");
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Lock released");
    }

    public static void main(String[] args) {

        System.out.println("Main Thread has started");

        Thread thread = new Thread(() -> {
            JoinDaemonPriorityInThread gPriorityInThread = new JoinDaemonPriorityInThread();
            gPriorityInThread.randomMethod();
        });

        /*
         * if you don't want the main thread should wait for some other thread 
         * just use as it is below.
         */
        thread.start();

        /*
         * If you want the main thread should wait before terminating for other thread to complete its execution
         * than use join()
         */
        // try {
        //     thread.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        System.out.println("Main thread finished its execution");
    }

}
