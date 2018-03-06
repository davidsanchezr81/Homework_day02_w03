import java.util.ArrayList;

public class Library{

    private ArrayList<Book> collection;
    private Integer capacity;

    public Library(){
        this.collection = new ArrayList<Book>();
        this.capacity = 3;
    }


    // Count books
    public int bookCount(){
        return collection.size();
    }

    public boolean isFull(){
        return bookCount() >= this.capacity;}

    // Add books
    public void addBook(Book book) {
        if(!isFull()) {
            collection.add(book);
        }
    }


}