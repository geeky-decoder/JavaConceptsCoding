import java.util.Iterator;

public class CollectionsIterator {
    public static void main(String[] args) {
        MyGenericList<Integer> myGenericList = new MyGenericList<>();
        myGenericList.add(10);
        myGenericList.add(20);
        myGenericList.add(30);
        myGenericList.add(40);

        // To call an iterator of collection<T>
        Iterator<Integer> iterator = myGenericList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterates over an array or an Iterable<T>
        for (int item : myGenericList) {
            System.out.println(item);
        }
    }

}
