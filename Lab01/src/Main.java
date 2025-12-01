public class Main {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book("Java Basics", "James Gosling", "111-111", 300.0);
        Book b2 = new Book("OOP Concepts", "Grady Booch", "222-222", 400.0);
        Book b3 = new Book("Database Systems", "Elmasri", "333-333", 450.0);

        // Create Student & Faculty
        Student s = new Student("Shifat", "shifat@student.com");
        Faculty f = new Faculty("Rahman Sir", "rahman@university.edu");


        s.borrowBook(b1);
        s.borrowBook(b2);
        f.borrowBook(b2);


        Library l = new Library();
        // l.printPersonDetails(s); 
        s.displayDetails();
        l.printPersonDetails(f);

        System.out.println("\nTotal books issued so far: " + Book.totalBookIssued);
    }
}
