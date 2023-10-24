package Streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.RowFilter.Entry;

public class StreamsWithPrimitiveDataTypes {

    public static void main(String[] args) {
        List<Integer> intList = List.of(23, 31, 11, 14, 6, 54, 42, 65);
        List<String> strList = List.of("forEach", "filter", "sorted", "map", "collect", "stream");

        Map<Integer, Integer> intMap = new HashMap<>();
        intMap.put(1, 4);
        intMap.put(2, 1);
        intMap.put(3, 5);
        intMap.put(4, 2);
        intMap.put(5, 6);
        intMap.put(6, 3);

        Map<String, String> strMap = new HashMap<>();
        strMap.put("Fruit", "Apple");
        strMap.put("Vegie", "Potato");
        strMap.put("Nuts", "Almond");
        strMap.put("Drink", "Sprite");
        strMap.put("Juice", "Orange");
        strMap.put("Chocolate", "Silk");

        System.out.println("------------------------------------------------");

        intList.stream().filter(t -> t > 30).forEach(System.out::println);
        System.out.println("------------------------------------------------");
        strList.stream().filter(t -> !t.contains("stream")).forEach(System.out::println);
        System.out.println("------------------------------------------------");

        intMap.entrySet().stream().filter(e -> e.getValue() > 3).map(Map.Entry::getKey).forEach(System.out::println);
        System.out.println("------------------------------------------------");
        strMap.entrySet().stream().filter(e -> !e.getKey().contains("Drink")).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------------------------------------------------");

        // // sorting in ascending
        // Collections.sort(intList);
        // Collections.sort(strList);

        // // sorting in descending
        // Collections.reverse(strList);
        // Collections.reverse(intList);

        intMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed()).forEach(System.out::println);
        System.out.println("------------------------------------------------");
        intMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).forEach(System.out::println);
        System.out.println("------------------------------------------------");

        Integer reduceUsingLambda = intList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceUsingLambda);
        System.out.println("------------------------------------------------");

        int sumUsingMethod = intList.stream().mapToInt(map -> map).sum();
        System.out.println(sumUsingMethod);
        System.out.println("------------------------------------------------");

        Optional<Integer> reduceUsingMethodReference = intList.stream().reduce(Integer::sum);
        System.out.println(reduceUsingMethodReference.get());
        System.out.println("------------------------------------------------");

        Integer reduceMultiply = intList.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduceMultiply);
        System.out.println("------------------------------------------------");

        Integer maxUsingLambda = intList.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(maxUsingLambda);
        System.out.println("------------------------------------------------");

        Integer minUsingLambda = intList.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println(minUsingLambda);
        System.out.println("------------------------------------------------");

        Optional<Integer> maxUsingReduceMethodReference = intList.stream().reduce(Integer::max);
        System.out.println(maxUsingReduceMethodReference.get());
        System.out.println("------------------------------------------------");

        Optional<Integer> minUsingReduceMethodReference = intList.stream().reduce(Integer::min);
        System.out.println(minUsingReduceMethodReference.get());
        System.out.println("------------------------------------------------");
    }
}