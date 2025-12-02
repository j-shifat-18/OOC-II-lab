abstract class Person {
    protected String name;
    protected String email;

    public Person() {
        this.name = "Default Name";
        this.email = "default@email.com";
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Abstract method
    public abstract void displayDetails();
}
