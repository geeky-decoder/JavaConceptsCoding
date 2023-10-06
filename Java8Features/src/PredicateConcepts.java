import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Using predicate with lambda expression in Java8 style
 */
public class PredicateConcepts {

    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t % 2 == 0;
        System.out.println(predicate.test(7));

        List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        arrList.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Given no. is even: " + t));
    }
}

/*
 * Actual method implementation of Predicate but with older way
 */
// public class PredicateConcepts implements Predicate<Integer> {

// @Override
// public boolean test(Integer t) {
// if (t % 2 == 0) {
// return true;
// } else {
// return false;
// }
// }

// public static void main(String[] args) {
// Predicate<Integer> predicate = new PredicateConcepts();
// System.out.println(predicate.test(4));
// }
// }
