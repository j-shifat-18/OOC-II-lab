package com.library;


public class Student extends Person {
    private String studentId;
  

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    public void borrowBook(Book book){

        if(totalBookBorrowed >=3 ){
            System.out.println("Cannot borrow more than 3 books.");
            return;
        }
        else if(!book.isAvailable()){
            System.out.println("Book is not available for borrowing.");
            return;
        }
        borrowedBooks.add(book);
        totalBookBorrowed++;
        Book.totalBookIssued++;
    }

    

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student Email: " + getEmail());
        System.out.println("Student ID: " + studentId);
        System.out.println("Borrowed Books:");
        for (Book b : borrowedBooks) {
            b.displayInfo();
        }
        System.out.println("************************");
    }
    
}
