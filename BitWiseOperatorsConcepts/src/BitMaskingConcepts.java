import java.util.Scanner;

public class BitMaskingConcepts {

    private int createMaskForTurningOnTheBinaryBit(int position) {
        return 1 << position;
    }

    private int createMaskForTurningOffTheBinaryBit(int position) {
        int initialMask = 1 << position;
        return ~(initialMask);
    }

    private int createMaskForTogglingTheBinaryBit(int position) {
        return 1 << position;
    }

    private int createMaskForCheckingTheBinaryBit(int position) {
        return 1 << position;
    }

    private int turnOnTheBinaryBit(int number, int mask) {
        return number | mask;
    }

    private int turnOffTheBinaryBit(int number, int mask) {
        return number & mask;
    }

    private int toggleTheBinaryBit(int number, int mask) {
        return number ^ mask;
    }

    private String checkTheBinaryBit(int number, int mask) {
        if ((number & mask) == 0) {
            return "OFF";
        } else {
            return "ON";
        }
    }

    public static void main(String[] args) {
        BitMaskingConcepts bitMask = new BitMaskingConcepts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("Enter position to turn ON");
        int onPosition = scanner.nextInt();
        System.out.println("Enter position to turn OFF");
        int offPosition = scanner.nextInt();
        System.out.println("Enter position to toggle");
        int togglingPosition = scanner.nextInt();
        System.out.println("Enter position to check for state");
        int checkPosition = scanner.nextInt();
        int maskForTurningOn = bitMask.createMaskForTurningOnTheBinaryBit(onPosition);
        int maskForTurningOff = bitMask.createMaskForTurningOffTheBinaryBit(offPosition);
        int maskForTogglingBit = bitMask.createMaskForTogglingTheBinaryBit(togglingPosition);
        int maskForCheckingState = bitMask.createMaskForCheckingTheBinaryBit(checkPosition);
        System.out.println(
                "Number after turning the bit ON is : " + bitMask.turnOnTheBinaryBit(number, maskForTurningOn));
        System.out.println(
                "Number after turning the bit OFF is : " + bitMask.turnOffTheBinaryBit(number, maskForTurningOff));
        System.out.println(
                "Number after toggling the bit is : " + bitMask.toggleTheBinaryBit(number, maskForTogglingBit));
        System.out.println(
                "State of ith position bit is : " + bitMask.checkTheBinaryBit(number, maskForCheckingState));
    }   
}
