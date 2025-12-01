public class Faculty extends Person{
    

    Faculty(String name , String email){
        super(name, email);
    }

    Faculty() {
        super();
    }

    @Override
    void displayDetails() {
        System.out.println("\n---- Faculty Details ----");
        System.out.println("Name  : " + getName());
        System.out.println("Email : " + getEmail());
        System.out.println("Borrowed Books:");
        for (Book b : borrowedBooks) {
            b.displayBookDetails();
        }
    }
}
