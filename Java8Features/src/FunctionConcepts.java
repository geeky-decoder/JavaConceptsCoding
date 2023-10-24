import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Using function with lambda expression in Java8 style
 */
public class FunctionConcepts {

    public static void main(String[] args) {
        Function<String, Integer> function = string -> string.length();
        System.out.println(function.apply("vivekpandey"));

        List<String> arrList = Arrays.asList("hi", "bye", "hello", "vivek", "pandey");
        arrList.stream().mapToInt(String::length).forEach(System.out::println);
    }
}

/*
 * Actual method implementation of Function but with older way
 */
// public class FunctionConcepts implements Function<String, Integer> {

// public static void main(String[] args) {
// Function<String, Integer> function = new FunctionConcepts();
// System.out.println(function.apply("vivekpandey"));
// }

// @Override
// public Integer apply(String t) {
// return t.length();
// }
// }
