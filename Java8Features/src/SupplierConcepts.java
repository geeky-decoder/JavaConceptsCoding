import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
 * Using supplier with lambda expression in Java8 style
 */
public class SupplierConcepts {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hi I am a supplier";
        System.out.println(supplier.get());

        List<String> arrList = Arrays.asList();
        System.out.println(arrList.stream().findAny().orElseGet(() -> "Hi I am a supplier"));
    }
}

/*
 * Actual method implementation of Supplier but with older way
 */
// public class SupplierConcepts implements Supplier<String> {

//     public static void main(String[] args) {
//         Supplier<String> supplier = new SupplierConcepts();
//         System.out.println(supplier.get());
//     }

//     @Override
//     public String get() {
//         return "Hi I am a supplier";
//     }
// }
