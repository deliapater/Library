import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BorrowerTest {

     Borrower borrower;
     Book  book;
     Library library;

    @Before
    public void setup(){
        borrower = new Borrower("Paola");
        book = new Book("Don Quixote", "Miguel de Cervantes", "novel");
        library = new Library();
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canTakeBooFromLibrary(){
        library.addBook(book)
        borrower.takeBook(library, book);
        assertEquals(1, borrower.bookCount());
    }
}
