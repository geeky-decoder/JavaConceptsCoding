import java.util.Iterator;
import java.util.function.Consumer;

// My List class to create my own list collection to use with custom implementation
public class MyGenericList<T> implements Iterable<T> {

    // Every collection is backed by some data structure so as we r using Array for
    // List collection
    private T[] listItems;
    private int listSize;

    public MyGenericList() {
        listSize = 0;
        listItems = (T[]) new Object[100];
    }

    public void add(T listItem) {
        listItems[listSize++] = listItem;
    }

    public T getListItemAtIndex(int index) {
        return listItems[index];
    }

    @Override
    public Iterator<T> iterator() {
        try {
            return new MyGenericListIterator(this);
        } catch (UnsupportedOperationException exception) {
            throw new UnsupportedOperationException("Unimplemented method 'iterator'");
        }
    }

    // My List class iterator with custom implementation
    class MyGenericListIterator implements Iterator<T> {

        private MyGenericList<T> list;
        private int index = 0;

        public MyGenericListIterator(MyGenericList<T> list) {
            this.list = list;
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            // TODO Auto-generated method stub
            Iterator.super.forEachRemaining(action);
        }

        @Override
        public boolean hasNext() {
            System.out.println("My List Iterator hasNext() called");
            return index < listSize;
        }

        @Override
        public T next() {
            System.out.println("My List Iterator next() called");
            return list.getListItemAtIndex(index++);
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            Iterator.super.remove();
        }
    }
}
