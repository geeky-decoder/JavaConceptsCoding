public class EvenOddNumbersClass {

    private static int counter = 0;
    private static int sequenceSize = 5;

    public synchronized void evenNumberMethod() {
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

    public synchronized void oddNumberMethod() {
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
