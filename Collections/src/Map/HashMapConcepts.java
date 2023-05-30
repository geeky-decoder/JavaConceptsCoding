package Map;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * HashMap is a default class in java and comes from java.util package
 * Default size of HashMap as soon as you create one is of 16(0-15)Buckets/Segments.
 * >>>>>>> Each bucket behaves as a Node which contains various other nodes <<<<<<<<
 * Default Load factor is (0.75 or 75%) [load factor is the measure that decides when to increase the capacity of the Map]
 * Does not maintain any order of insertion/retrieval
 * Does not use indexing <<<<>>>> instead uses <Key, Value> pairs
 * Key cannot be duplicate <<<<>>>>>
 * <<<<>>>> Multiple null values are allowed but only 1 key is allowed as null. <<<<<>>>>>
 * <<<<<>>>> It is not thread-safe/synchronized
 * <><><><><><><><><><>ALWAYS USE Interface<K,V> name = new ImplementedClassConstructor<>(); <><><><><><><><><><><><><><><>
 * for ex. Map<String, String> map = new HashMap<>();
 * 
 * ************************** LINKEDHASHMAP ***************************
 * Maintains any order of insertion/retrieval [stores value in form of Node(doubly linkedlist)]
 */
class LearnHashMap {

    public void hashMapBascis() {
        Map<String, String> basicMap = new HashMap<>();
        basicMap.put("Mango", "Yellow");
        basicMap.put("Apple", "Red");

        /*
         * only 1 key is allowed as null i.e. if any other key is set to null than
         * the previous value will get overriden with the new value of null key
         */
        basicMap.put(null, "Chicku");
        System.out.println(basicMap.get(null));
        basicMap.put(null, "Kiwi");
        System.out.println(basicMap.get(null));

        /*
         * multiple null values is allowed and there will be no overrding
         */
        basicMap.put("Purple", null);
        basicMap.put("Brown", null);
        basicMap.put("Black", null);
        System.out.println(basicMap.get("Purple"));
        System.out.println(basicMap.get("Brown"));
        System.out.println(basicMap.get("Black"));
    }

    public void waysToIterateHashMap(Map<String, String> hashMap) {
        /*
         * iterate over the keys using keySet
         */
        Iterator<String> keysIterator = hashMap.keySet().iterator();
        while (keysIterator.hasNext()) {
            String key = keysIterator.next();
            System.out.println("Key is " + key + " and value is " + hashMap.get(key));
        }
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

        /*
         * iterate over the pair of key & value using entrySet
         */
        Iterator<Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> mapPairs = iterator.next();
            System.out.println("Key is " + mapPairs.getKey() + " and value is " + mapPairs.getValue());
        }
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

        /*
         * iteratpe map using java 8 and lambda
         */
        hashMap.forEach((key, value) -> System.out.println("Key is " + key + " and value is " + value));
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }

    public void compareHashMaps() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("India", "New Delhi");
        map1.put("Uttarakhand", "Dehradun");
        map1.put("Rajasthan", "Jaipur");
        map1.put("Assam", "Dispur");
        map1.put("Punjab", "Chandigarh");

        Map<String, String> map2 = new HashMap<>();
        map2.put("Maharashtra", "New Delhi");
        map2.put("Goa", "Dehradun");
        map2.put("West Bengal", "Jaipur");
        map2.put("Gujarat", "Dispur");
        map2.put("Haryana", "Chandigarh");

        Map<String, String> map3 = new HashMap<>();
        map3.put("India", "New Delhi");
        map3.put("Uttarakhand", "Dehradun");
        map3.put("Rajasthan", "Jaipur");
        map3.put("Assam", "Dispur");
        map3.put("Punjab", "Chandigarh");
        map3.put("Haryana", "Chandigarh");

        /*
         * compare on the basis of key-value pairs using equals method
         */
        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

        /*
         * compare on the basis of keys using equals method
         */
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));

        /*
         * compare on the basis of extra keys present using HashSet
         */
        HashSet<String> hashSet = new HashSet<>();
        // combine/union of both the maps keySet
        hashSet.addAll(map1.keySet());
        hashSet.addAll(map3.keySet());
        // to remove the keySet of map1 so as to find out the extra keys present
        hashSet.removeAll(map1.keySet());
        System.out.println(hashSet);

        /*
         * compare on the basis of values of maps using HashSet AND ArrayList
         */
        // when duplicates are not allowed
        // Remember as Map does not preserve order so while conversion to ArrayList to
        // maps might give different outputs.
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));

        // when duplicates are allowed
        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
    }

    public void waysToCreateHashMap() {
        /*
         * using HashMap class
         */
        Map<String, String> map = new HashMap<>();

        /*
         * JDK 8
         * using one 2D-Array and storing the resultant into the map object
         */
        Map<String, String> jdk8Map = Stream.of(new String[][] { { "Map1", "Value1" }, { "Map2", "Value2" } })
                .collect(Collectors.toMap(data -> data[0], data -> data[1]));
        System.out.println(jdk8Map);

        /*
         * using SimpleEntry<K, V> : mutuable map
         * JDK8
         */
        Map<String, String> entryMap = Stream.of(
                new AbstractMap.SimpleEntry<>("Key1", "Value1"),
                new AbstractMap.SimpleEntry<>("Key2", "Value2"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(entryMap);

        /*
         * using SimpleImmutableEntry<K, V> : Immutuable map
         * JDK8
         */
        Map<String, String> immutableMap = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Key1", "Value1"),
                new AbstractMap.SimpleImmutableEntry<>("Key2", "Value2"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(immutableMap);
    }

    public void synchronizedMapConcepts() {
        /*
         * normal unsynchronized HashMap
         */
        Map<String, String> unsynchronizedMap = new HashMap<>();
        unsynchronizedMap.put("Uttarakhand", "Dehradun");
        unsynchronizedMap.put("Rajasthan", "Jaipur");

        /*
         * converted above unsynchronized HashMap to synchronized Map using
         * Collections.synchronizedMap()
         */
        Map<String, String> synchronizedMap = Collections.synchronizedMap(unsynchronizedMap);

        /*
         * Declared a totally synchronized and concurrent Map using ConcurrentHashMap
         */
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Uttarakhand", "Dehradun");
        concurrentHashMap.put("Rajasthan", "Jaipur");
    }

    public void convertHashMapToArrayList(Map<String, String> map) {
        /*
         * convert using Java 8 Stream
         */
        List<String> keyList = map.keySet().stream().collect(Collectors.toList());
        System.out.println(keyList);

        List<String> valueList = map.values().stream().collect(Collectors.toList());
        System.out.println(valueList);

        /*
         * entrySet method to convert but also to retain the key/value pair
         */
        Set<Map.Entry<String, String>> mapSet = map.entrySet();
        List<Map.Entry<String, String>> mapToList = new ArrayList<>(mapSet);
        System.out.println(mapToList);
    }
}

public class HashMapConcepts {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("Uttarakhand", "Dehradun");
        capitals.put("Uttar Pradesh", "Prayagraj");
        capitals.put("Maharashtra", "Mumbai");
        capitals.put("Goa", "Panaji");
        capitals.put("West Bengal", "Kolkata");
        capitals.put("Gujarat", "Gandhinagar");
        capitals.put("Rajasthan", "Jaipur");
        capitals.put("Assam", "Dispur");

        LearnHashMap learnHashMap = new LearnHashMap();
        learnHashMap.hashMapBascis();
        learnHashMap.waysToIterateHashMap(capitals);
        learnHashMap.compareHashMaps();
        learnHashMap.waysToCreateHashMap();
        learnHashMap.synchronizedMapConcepts();
        learnHashMap.convertHashMapToArrayList(capitals);
    }
}
