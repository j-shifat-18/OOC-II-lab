import java.util.ArrayList;
import java.util.List;

class Faculty extends Person {
    private List<Book> borrowedBooks = new ArrayList<>();

    public Faculty() {
        super("Default Faculty", "faculty@default.com");
    }

 
    public Faculty(String name, String email) {
        super(name, email);
    }

    public void borrowBook(Book b) {
        borrowedBooks.add(b);
        Book.totalBooksIssued++;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Faculty Details ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
        } else {
            System.out.println("Borrowed Books:");
            for (Book b : borrowedBooks) {
                b.displayInfo();
            }
        }
    }
}
