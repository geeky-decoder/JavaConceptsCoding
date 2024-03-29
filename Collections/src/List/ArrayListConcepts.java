package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

class LearnArrayList {

    public final void waysToIterateArrayList(List<String> arrayList) {
        int sizeOfList = arrayList.size();
        

        List<String> list = new ArrayList<>();
        Queue<String> queue = new PriorityQueue<>();
        Set<String> set = new HashSet<>();

        list.add("");
        set.add("");
        queue.add("");

        
        /*
         * using normal for-loop
         */
        for (int i = 0; i < sizeOfList; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("----------");
        /*
         * using for-each loop
         */
        for (String fruitName : arrayList) {
            System.out.println(fruitName);
        }
        System.out.println("----------");
        /*
         * using streams & lambda
         */
        arrayList.stream().forEach(fruitName -> System.out.println(fruitName));
        System.out.println("----------");
        /*
         * using iterator
         */
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------");
    }

    public void arrayListMethods(ArrayList<String> arrayList) {
        List<String> vegetableNames = new ArrayList<>(Arrays.asList("Potato", "Onion", "Tomato", "Cabbage"));

        /*
         * to add all the values present in second list to first list
         */
        arrayList.addAll(vegetableNames);
        System.out.println(arrayList);

        /*
         * to add all the values present in second list to first list but from some
         * index value
         */
        arrayList.addAll(2, vegetableNames);
        System.out.println(arrayList);

        /*
         * to remove all the elements and left with empty arrayList
         */
        // arrayList.clear(); ------------------
        // System.out.println(arrayList);

        /*
         * Returns a shallow copy of this ArrayList instance. (The elements themselves
         * are not copied)
         */
        List<String> duplicateList = (ArrayList<String>) arrayList.clone();
        System.out.println(duplicateList);

        /*
         * returns a boolean after checking the list for the mentioned value
         */
        System.out.println(arrayList.contains("Potato"));
        System.out.println(arrayList.contains("Guava"));

        /*
         * returns index of first occurrence of specified element in the list, or -1 if
         * this list does not contain the element
         */
        System.out.println(arrayList.indexOf("Cabbage"));
        System.out.println(arrayList.indexOf("Guava"));

        /*
         * Removes the first occurrence of the specified element from this list, if it
         * is present. If the list does not contain the element, it is unchanged
         */
        duplicateList.remove("Cabbage");
        duplicateList.remove("Guava");
        System.out.println(duplicateList);
        /*
         * Removes the element at the specified position in this list. Shifts any
         * subsequent elements to the left (subtracts one from their indices).
         */
        duplicateList.remove(8);
        System.out.println(duplicateList);

        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        /*
         * for Integer as Generics if we try to use remove method that deletes given
         * element just like in String you will get
         * java.lang.IndexOutOfBoundsException because if the given value will be larger
         * than the size of current list
         * it will throw the exception bcoz the value you passed is a integer and it
         * will consider that as index value
         */
        // numbersList.remove(200); -------------------

        /*
         * to overcome above problem you need to use valueOf function of Integer class
         * bcoz it returns
         * Integer class as Object that will not be treated as normal interger value and
         * hence you will be able
         * to delete that particular element from the list
         */
        numbersList.remove(Integer.valueOf(10));
        System.out.println(numbersList);

        /*
         * Removes all of the elements of this collection that satisfy the given
         * predicate.
         * Errors or runtime exceptions thrown during iteration or by the predicate are
         * relayed to the caller.
         * NullPointerException - if the specified filter is null
         */
        // numbersList.removeIf(null); -------------------

        numbersList.removeIf(number -> number % 2 == 0);
        System.out.println(numbersList);

        /*
         * Retains only the elements in this list that are contained in the specified
         * collection.
         * In other words, removes from this list all of its elements that are not
         * contained in the specified collection.
         */
        List<String> retainList = new ArrayList<>(Arrays.asList("Circle", "Oval", "Square", "Circle", "Traingle"));
        /*
         * Collections.singleton -> Returns an immutable set containing only the
         * specified object.
         * The returned set is serializable.
         */
        retainList.retainAll(Collections.singleton("Circle"));
        System.out.println(retainList);

        /*
         * Returns a view of the portion of this list between the specified fromIndex,
         * inclusive, and toIndex, exclusive.
         * (If fromIndex and toIndex are equal, the returned list is empty.
         * >>>> Sublist doesn't create deep copy instead creates shallow copy(reference
         * gets copied) <<<<
         * Therefore any changes made to the list using sublist it will change the
         * contents of the list which is getting sublist.
         */
        List<String> subList = new ArrayList<>(duplicateList.subList(2, 5));
        System.out.println(subList);

        /*
         * Returns an array containing all of the elements in this list in proper
         * sequence (from first to last element).
         */
        Object[] array = subList.toArray();
        /*
         * Returns a string representation of the contents of the specified array.
         * If the array contains other arrays as elements,
         * they are converted to strings by the Object.toString method inherited from
         * Object
         */
        System.out.println(Arrays.toString(array));

        for (Object obj : array) {
            System.out.println((String) obj);
        }
    }

    public void synchornizedArrayList(List<String> arrayList) {
        /*
         * Returns a synchronized (thread-safe) list backed by the specified list.
         * for add/remove we don't need explicit synchronization
         * for traversing/fetch we need to use explicit synchronization
         */
        List<String> synchronizedList = Collections.synchronizedList(arrayList);

        synchronized (synchronizedList) {
            Iterator<String> iterator = synchronizedList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        }

        /*
         * Creates a list containing elements of specified collection, in the order they
         * are returned by collection's iterator.
         * ******>>>>>>> THIS IS THE THREAD SAFE VERSION OF ARRAYLIST BY DEFAULT
         * SYNCHRONIZED (Interview question)<<<<<<<<*******
         * we don't need explicit synchronization for any operation performed on this
         * type of list
         */
        CopyOnWriteArrayList<String> synchronizedArrayList = new CopyOnWriteArrayList<>(arrayList);
        Iterator<String> synchronizedIterator = synchronizedArrayList.iterator();
        while (synchronizedIterator.hasNext()) {
            System.out.println(synchronizedIterator.next());
        }
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }

    public void removeDuplicates(List<String> arrayList) {
        /*
         * Use LinkedHashSet >>>>>>>>> Reason being Set contains unique elements
         */
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(arrayList);
        List<String> uniqueElementsList = new ArrayList<>(hashSet);
        System.out.println(uniqueElementsList);
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");

        /*
         * Use Streams >>>>>>>>> Streams has the distinct method which only keeps unique
         * elements
         */
        List<String> listOfUniqueElements = (ArrayList<String>) arrayList.stream().distinct()
                .collect(Collectors.toList());
        System.out.println(listOfUniqueElements);
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }

    public void compareArrayLists() {
        /*
         * use list equals method
         */
        List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript", "C#"));
        List<String> list3 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript"));

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));

        /*
         * find the additional elements if the resultant list is empty that means given
         * lists are equals else not
         */
        List<String> list4 = new ArrayList<>(
                Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript", "Ruby"));
        List<String> list5 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript", "C#"));
        list4.removeAll(list5);
        System.out.println(list4);
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        /*
         * find the missing elements if the resultant list is empty that means given
         * lists are equals else not
         */
        List<String> list6 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript"));
        List<String> list7 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript", "C#"));
        list7.removeAll(list6);
        System.out.println(list7);
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        /*
         * find the common elements if the resultant list is empty that means given
         * lists ! are not equal else not
         */
        List<String> list8 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript"));
        List<String> list9 = new ArrayList<>(Arrays.asList("Java", "Python", "Kotlin", "GO", "JavaScript", "C#"));
        list9.retainAll(list8);
        System.out.println(list9);
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
    }
}

public class ArrayListConcepts {
    public static void main(String[] args) {
        /*
         * ArrayList with Generics as String
         */
        ArrayList<String> fruitNames = new ArrayList<>();
        fruitNames.add("Apple");
        fruitNames.add("Banana");
        fruitNames.add("Grapes");
        fruitNames.add("Kiwi");
        fruitNames.add("Mango");
        fruitNames.add("Orange");
        fruitNames.add("Papaya");

        LearnArrayList learnArrayList = new LearnArrayList();
        learnArrayList.waysToIterateArrayList(fruitNames);
        learnArrayList.arrayListMethods(fruitNames);
        learnArrayList.synchornizedArrayList(fruitNames);
        learnArrayList.removeDuplicates(fruitNames);
        learnArrayList.compareArrayLists();
    }
}
