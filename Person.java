// Person.java
class Persons {
    String name;

    // Constructor
    Persons(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
    }
}
public class Person {
    static Persons CreatePerson(String name){
        return new Persons(name);
    }
    public static void main(String[] args){
        Persons p1= CreatePerson("Sam");
        p1.display();
        Persons p2=CreatePerson("Tom");
        p2.display();
    }
}
