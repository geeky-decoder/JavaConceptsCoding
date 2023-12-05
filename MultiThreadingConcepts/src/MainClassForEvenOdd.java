public class MainClassForEvenOdd {

    public static void main(String[] args) {

        EvenOddNumbersClass evenOddNumbersClass = new EvenOddNumbersClass();

        Thread evenThread = new Thread(() -> {
            evenOddNumbersClass.evenNumberMethod();
        });

        Thread oddThread = new Thread(() -> {
            evenOddNumbersClass.oddNumberMethod();
        });

        evenThread.start();
        oddThread.start();
    }

}
