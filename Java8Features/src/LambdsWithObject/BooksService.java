package LambdsWithObject;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BooksService {

    /*
     * Lambda expression for comparing and sorting objects according to different attributes
     */
    public List<Book> getAllBooks() {
        List<Book> books = new BookDao().books();
        Collections.sort(books, (bookObj1, bookObj2) ->
        bookObj1.getBookName().compareTo(bookObj2.getBookName()));
        return books;
    }

    /*
     * Old way of calling the custom comparator class and than comparing and sorting objects according to different attributes
     */
    // public List<Book> getAllBooks() {
    //     List<Book> books = new BookDao().books();
    //     Collections.sort(books, new MyCustomComparator());
    //     return books;
    // }

    public static void main(String[] args) {
        System.out.println(new BooksService().getAllBooks());
    }

    /*
     * Old way of creating custom comparator class and than overriding the method and than comparing and sorting objects according to different attributes
     */
    // class MyCustomComparator implements Comparator<Book> {

    //     @Override
    //     public int compare(Book o1, Book o2) {
    //         return o1.getBookName().compareTo(o2.getBookName());
    //     }
    // }
}
