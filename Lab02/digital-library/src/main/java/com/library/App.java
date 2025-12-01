package com.library;

public class App {
    public static void main(String[] args) {
        
        Student student =new Student("Alice" , "alice@gmail.com", "S123");
        Student student2 =new Student("shifat" , "shifat@gmail.com", "S124");
        // student.displayDetails();

        Book book1 = new Book("B001", "Java Programming", "Author A" , 5);
        Book book2 = new Book("B002", "Python Programming", "Author B" , 3);

        student.borrowBook(book1);
        student.borrowBook(book1);
        student.borrowBook(book1);
        student2.borrowBook(book1);
        student2.borrowBook(book1);
        
        student2.borrowBook(book1);
        student2.borrowBook(book1);
        // student.borrowBook(book2);

        student.displayDetails();
        student2.displayDetails();
    }
}
