package LambdsWithObject;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> books() {
        List<Book> books = new ArrayList<>();
        books.add(0, new Book("abc1234", "FunWithTech", 230));
        books.add(1, new Book("def1234", "SpringBoot", 550));
        books.add(2, new Book("jkl1234", "Cloud Computing", 1200));
        books.add(3, new Book("mno1234", "Event Streaming", 425));
        return books;
    }
}
