import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;
    private int capacity;


    public Library(){
        this.book = new ArrayList<Book>();
        this.capacity = 2;
    }

    public int countBooks() {
        return this.book.size();
    }

    public void addBook(Book book) {
        if(this.countBooks() < this.capacity) {
            this.book.add(book);
        }

        public Book checksOut(Book book) {
            int index = this.book.indexOf(book);
            return this.book.remove(index);
        }
    }
}
