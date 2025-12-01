import java.util.ArrayList;
import java.util.List;

abstract class Person {
    private String name ; 
    private String email ;
    protected List<Book> borrowedBooks ; 

    Person(String name , String email){
        this.name = name ; 
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    Person(){
        this("Sample Name", "sample@example.com");
    }

    protected String getName() {
        return name;
    }

    protected String getEmail() {
        return email;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        Book.totalBookIssued++;
    }

    abstract void displayDetails();


}
