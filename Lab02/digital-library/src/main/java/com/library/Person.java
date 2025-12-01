package com.library;

import java.util.ArrayList;
import java.util.List;

abstract class Person {
    protected String name;
    protected String email;
    protected List<Book> borrowedBooks;
    protected int totalBookBorrowed = 0;
    

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
        this.totalBookBorrowed = 0;
    }

    

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract void displayDetails();
}
