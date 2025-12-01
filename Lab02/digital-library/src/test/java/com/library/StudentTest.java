package com.library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void testDisplayDetails() {
        var s = new Student("Alice" , "alice@gmail.com", "S123");
        
    }

    @Test
    void testGetStudentId() {
        var s = new Student("Alice" , "alice@gmail.com", "S123");
        assertEquals("S123", s.getStudentId());
        assertEquals("Alice", s.getName());
        assertEquals("alice@gmail.com", s.getEmail());
    }
}
