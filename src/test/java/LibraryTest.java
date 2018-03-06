import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void totalBook(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
//
    @Test
    public void canAddIfPossible(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);

        assertEquals(3, library.bookCount());
    }
}


//method to count number of books in library
//method to add a book to the library
//Add a capacity to the library
//Method to check if stock is full before adding books