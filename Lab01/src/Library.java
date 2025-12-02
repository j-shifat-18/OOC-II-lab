class Library {

    // runtime polymorphism
    public void printPersonDetails(Person p) {
        p.displayDetails();  
    }

    public static void main(String[] args) {


        Book b1 = new Book("Java Programming", "James Gosling", "1111", 600);
        Book b2 = new Book("Database Systems", "Elmasri", "2222", 750);


        Student s1 = new Student("Shifat", "shifat@student.com");
        s1.borrowBook(b1);

        Faculty f1 = new Faculty("Dr. Rahman", "rahman@faculty.com");
        f1.borrowBook(b2);


        Library lib = new Library();

        lib.printPersonDetails(s1);
        lib.printPersonDetails(f1);

        System.out.println("\nTotal Books Issued: " + Book.totalBooksIssued);
    }
}
