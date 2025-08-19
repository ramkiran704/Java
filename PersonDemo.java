// Person.java
class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    // Method to display the person's name
    void display() {
        System.out.println("Name: " + name);
    }
}

// Utility class with changeName method (outside Person class)
class PersonUtils {
    static void changeName(Person p, String newName) {
        p.name = newName;
    }
}

// Main class
public class PersonDemo {
    public static void main(String[] args) {
        // Create a Person object with name "Alice"
        Person p1 = new Person("Alice");

        System.out.println("Before change:");
        p1.display();

        // Change name to "Bob" using changeName() method
        PersonUtils.changeName(p1, "Bob");

        System.out.println("After change:");
        p1.display();
    }
}

