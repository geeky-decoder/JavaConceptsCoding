import java.util.Scanner;

public class FormatConversion {

    static String convertDecimalToBinary(int deciNum) {
        String binary = "";

        while (deciNum != 0) {
            int bit = deciNum % 2;
            deciNum /= 2;
            // will place the reminder first followed by empty string so that we get exact binary as result
            binary = bit + binary;
        }
        return binary;
    }

    static int convertBinaryToDecimal(String binary) {
        int result = 0;
        int powerOf2 = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            // whenever there is 1 in binary we will add the power in result
            if (binary.charAt(i) == '1') {
                result = result + (int) Math.pow(2, powerOf2);
            }
            // will keep on increasing the power in both cases whether there is 0 or 1 in binary
            ++powerOf2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deciNum = scanner.nextInt();
        String binary = convertDecimalToBinary(deciNum);
        int decimal = convertBinaryToDecimal(binary);
        System.out.println("Binary representation of " + deciNum + " is -> " + binary);
        System.out.println("Decimal representation of " + binary + " is -> " + decimal);
        scanner.close();
    }
}
