class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    public static int totalBooksIssued = 0;

    public Book() {
        this.title = "Sample Book";
        this.author = "Unknown";
        this.isbn = "0000";
        this.price = 0.0;
    }

    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " | Author: " + author + " | ISBN: " + isbn + " | Price: " + price);
    }
}
