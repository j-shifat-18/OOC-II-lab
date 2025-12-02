import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private List<Book> borrowedBooks = new ArrayList<>();

    public Student() {
        super("Default Student", "student@default.com");
    }

    public Student(String name, String email) {
        super(name, email);
    }

    public void borrowBook(Book b) {
        borrowedBooks.add(b);
        Book.totalBooksIssued++; // increment static count
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
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
