import java.util.Scanner;

public class BitwiseConcepts {

    private void bitwiseAndOrXorOperators(int num1, int num2) {
        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
    }

    private void bitwiseShiftAndNegationOperators(int num) {
        System.out.println(num >> 1);
        System.out.println(-num >> 1);
        System.out.println(num << 1);
        System.out.println(-num << 1);
        System.out.println(num >>> 1);
        System.out.println(-num >> 1);
        System.out.println(~num);
        System.out.println(~(-num));
    }

    public static void main(String[] args) throws Exception {
        BitwiseConcepts concepts = new BitwiseConcepts();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 nos. for btiwise AND, OR, XOR operations");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        concepts.bitwiseAndOrXorOperators(num1, num2);

        System.out.println("Enter 1 no. for btiwise LEFT, RIGHT SHIFT and COMPLEMENT operations");
        int num = scanner.nextInt();
        concepts.bitwiseShiftAndNegationOperators(num);
        scanner.close();
    }
}
