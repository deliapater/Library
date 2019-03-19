import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setup() {
        library = new Library();
    }

    @Test
    public void canGetNumberOfBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void hasFullstock() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }
}
