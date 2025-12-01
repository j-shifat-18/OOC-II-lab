package com.library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int quantity;
    static int totalBookIssued = 0;

    public Book(String title, String author, String isbn , int quantity) {
         this.title = title;
         this.author = author;
         this.isbn = isbn;
         this.quantity = quantity;
         this.isAvailable = quantity > 0;
    }

    

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        if(quantity <= totalBookIssued){
            isAvailable = false;
        }
        return isAvailable;
    }


    public void displayInfo() {
        System.out.println("==========================");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        // System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
