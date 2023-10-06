import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Using consumer with lambda expression in Java8 style
 */
public class ConsumerConcepts {

    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("Hi I am a consumer with value: " + t);
        consumer.accept(25);

        List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        arrList.stream().forEach(t -> System.out.println("Given nos. are: " + t));
    }
}

/*
 * Actual method implementation of Consumer but with older way
 */
// public class ConsumerConcepts implements Consumer<Integer> {

// public static void main(String[] args) {
// Consumer<Integer> consumer = new ConsumerConcepts();
// consumer.accept(25);
// }

// @Override
// public void accept(Integer t) {
// System.out.println("Hi I am a consumer with value: " + t);
// }
// }
