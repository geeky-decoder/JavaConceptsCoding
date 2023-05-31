package List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class LearnLinkedList {

    public final void waysToIterateArrayList(List<Integer> linkedlist) {
        int size = linkedlist.size();

        /*
         * using normal for-loop
         */
        for (int i = 0; i < size; i++) {
            System.out.println(linkedlist.get(i));
        }
        System.out.println("----------");
        /*
         * using for-each loop
         */
        for (int numbers : linkedlist) {
            System.out.println(numbers);
        }
        System.out.println("----------");
        /*
         * using streams & lambda
         */
        linkedlist.stream().forEach(numbers -> System.out.println(numbers));
        System.out.println("----------");
        /*
         * using ListIterator
         */
        ListIterator<Integer> listIterator = linkedlist.listIterator();
        // while (listIterator.hasNext()) {
        // System.out.println(listIterator.next());
        // }
        System.out.println("----------");

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());

    }
}

public class LinkedListConcepts {
    public static void main(String[] args) {
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);
        linkedlist.add(60);

        LearnLinkedList learnLinkedList = new LearnLinkedList();
        learnLinkedList.waysToIterateArrayList(linkedlist);
    }
}
