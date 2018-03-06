import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.debugger.cdbg.CVAttributes;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("George");
        book = new Book();
    }

    @Test
    public void canHaveBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.getBookCount());
    }


    @Test
    public void canAddIfPossible(){
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.addBook(book);
        assertEquals(6, borrower.getBookCount());
    }
}
