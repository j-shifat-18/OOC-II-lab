public class Book {
    private String title; 
    private String author ; 
    private String isbn ;
    private double price ;


    static int totalBookIssued = 0 ;


    Book(String title , String author , String isbn , double price){
        this.title = title ;
        this.author = author ;
        this.isbn = isbn;
        this.price = price;
    }


    Book(){
        this("Sample Book", "Author", "abcde", 0.0000);
    }

    void displayBookDetails(){
        System.out.println("  - " + title + " by " + author + " (ISBN: " + isbn + ", Price: " + price + ")");
    }

}
