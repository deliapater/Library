public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }


}




//////<!--Write a method to count the number of books in the library.-->
//////<!--Write a method to add a book to the library stock.-->
//////<!--Add a capacity to the library and write a method to check if stock is full before adding a book.-->
//////<!--Extensions:-->
//////<!--Add a third class which interacts with the other two. E.g. you could add a Borrower with a method that takes a Book and moves to the Borrower's collection.-->