public class EvenOddNumbersClass {

    private static int counter = 0;
    private static int sequenceSize = 5;

    public void evenNumberMethod() {
        synchronized(this) {
            while (counter < sequenceSize) {
            while (counter % 2 == 0) {
                System.out.println(counter + " is an even number");
                try {
                    wait();
                } catch (Exception exception) {
                    // handle
                }
            }
            counter++;
            notify();
        }
        }
    }

    public void oddNumberMethod() {
        synchronized (this) {
            while (counter < sequenceSize) {
                while (counter % 2 != 0) {
                    System.out.println(counter + " is an odd number");
                    try {
                        wait();
                    } catch (Exception exception) {
                        // handle
                    }
                }
                counter++;
                notify();
            }
        }
    }
}
