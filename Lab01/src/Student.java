public class Student extends Person {
 

    Student(String name , String email ){
        super(name, email);
     
    }

    Student(){
        super();
    }

    void displayDetails() {
        System.out.println("\n---- Student Details ----");
        System.out.println("Name  : " + getName());
        System.out.println("Email : " + getEmail());
        System.out.println("Borrowed Books:");
        for (Book b : borrowedBooks) {
            b.displayBookDetails();
        }
    }
}
