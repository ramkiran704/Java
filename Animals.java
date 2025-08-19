class Animal{
    String name;
    int age;
    Animal(String name ,int age){
        this.name=name;
        this.age=age;
    }
    void displayInfo(){
        System.out.println("Name"+name);
        System.out.println("Age:"+age);
    }
}
class Dog extends Animal{
    String breed;
    Dog(String name,int age,String breed){
        super(name,age);
        this.breed=breed;
    }
    void displayInfo(){
        System.out.println("Breed"+breed);
    }
    void bark(){
        System.out.println("Barking");
    }
}
public class Animals {
    public static void main(String[] args) {
        Dog ob= new Dog("Buddy", 3, "Golden Retriever");
        ob.displayInfo();
        ob.bark();
    }
    
}
