public class SharedResourceClass {

    boolean isItemAvailable;

    // synchronized block avoid conflicts between threads
    public synchronized void addItem() {
        System.out.println("Inside addItem method of SharedResourceClass");
        isItemAvailable = true;
        try {
            System.out.println("Inside addItem method of SharedResourceClass, notifyAll is called");
            notifyAll();
        } catch (Exception exception) {
            // handle
        }
    }

    // // synchronized block avoid conflicts between threads
    public synchronized void consumeItem() {
        System.out.println("Inside consumeItem method of SharedResourceClass");

        // prefer 'while' loop in place of 'if'
        while (!isItemAvailable) {
            try {
                System.out.println("Inside consumeItem method of SharedResourceClass, thread in waiting");
                // releases all the montior locks
                wait();
            } catch (Exception exception) {
                // handle again
            }
        }
        isItemAvailable = false;
        System.out.println("Inside consumeItem method of SharedResourceClass, item gets consumed");
    }
}
