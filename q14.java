abstract class Person2{
    abstract void eat();
    abstract void exercise();
}
class Athlete extends Person2 {
    void eat(){
        System.out.println("Strong Diet");
    }
    void exercise(){
        System.out.println("Regular Exercise");
    }
}
class LazyPerson extends Person2{
    void eat(){
        System.out.println("No Diet");
    }
    void exercise(){
        System.out.println("No Exercise");
    }
}
public class q14 {
    public static void main(String[] args) {
       Person2 p;
       p=new Athlete();
       System.out.println("Athlete");
       p.eat();
       p.exercise();
       p=new LazyPerson();
       System.out.println("Lazy Person");
       p.eat();
       p.exercise();
    }
}
