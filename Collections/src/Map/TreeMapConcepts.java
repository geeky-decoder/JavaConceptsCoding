package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Treemap is a derived from SortedMap
 * Whatever key/values you put into TreeMap the resultant output will be a Sorted Map with keys being sorted in ascending order
 */
class LearnTreeMap {

    public void basicConceptsAndMethods(Map<Integer, String> empSalary) {

        /*
         * To get the output from TreeMap as sorted by default
         */
        System.out.println(empSalary);

        /*
         * If you need the keys to be sorted in descending order you need to mention
         * that while initializing the TreeMap
         */
        Map<Integer, String> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put(15000, "Nikhil");
        reverseMap.put(20000, "Harish");
        reverseMap.put(35000, "Ramesh");
        reverseMap.put(40000, "Aman");
        reverseMap.put(50000, "Nitesh");
        System.out.println(reverseMap);

        /*
         * If you want to get the output less than some value than use : headMap()
         */
        Set<Integer> lessThanSet = ((TreeMap<Integer, String>) empSalary).headMap(30000).keySet();
        System.out.println(lessThanSet);

        /*
         * If you want to get the output more than some value than use : tailMap()
         */
        Set<Integer> moreThanSet = ((TreeMap<Integer, String>) empSalary).tailMap(30000).keySet();
        System.out.println(moreThanSet);

        /*
         * If you need first and last key present in TreeMap as output
         */
        System.out.println(((TreeMap<Integer, String>) empSalary).firstKey());
        System.out.println(((TreeMap<Integer, String>) empSalary).lastKey());
    }
}

public class TreeMapConcepts {
    public static void main(String[] args) {
        Map<Integer, String> empSalary = new TreeMap<>();
        empSalary.put(15000, "Nikhil");
        empSalary.put(20000, "Harish");
        empSalary.put(35000, "Ramesh");
        empSalary.put(40000, "Aman");
        empSalary.put(50000, "Nitesh");

        LearnTreeMap learnTreeMap = new LearnTreeMap();
        learnTreeMap.basicConceptsAndMethods(empSalary);
    }
}
