package LambdsWithObject;

public class Book {

    private String bookId;
    private String bookName;
    private int bookPrice;

    public Book(String bookId, String bookName, int bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Book() {
    }

    public String getBookId() {
        return this.bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return this.bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "{" +
            " bookId='" + getBookId() + "'" +
            ", bookName='" + getBookName() + "'" +
            ", bookPrice='" + getBookPrice() + "'" +
            "}";
    }
    
    
}
