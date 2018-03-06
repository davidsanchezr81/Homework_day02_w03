import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borcollection;
    private Integer allowance;


    public Borrower(String name) {
        this.name = name;
        this.borcollection = new ArrayList<Book>();
        this.allowance = 5;
    }

    public int getBookCount() {
        return this.borcollection.size();
    }

    public void addBook(Book book) {
        if (getBookCount() < this.allowance) ;
        {
            this.borcollection.add(book);
        }
    }


        public void removeBook (Book book){
            this.borcollection.remove(book);
        }

//    public void borrowing(Library library) {
////        if (getBookCount() <= this.allowance) {
////            Book book = borcollection.removeBook();
////            addBook(book);
////        }
////    }

    }




