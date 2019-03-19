import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name =  name;
        this.collection = new ArrayList<Book>();
    }


    public int bookCount() {
        return this.collection.size();
    }

    public void takeBook(Library library, Book book) {
        Book book = library.checksOut(book);
        this.collection.add(book);
    }
}
