abstract class Shape2{
    abstract void numOfSides();
}
class Rectangle2 extends Shape2{
    void numOfSides(){
        System.out.println("Rectangle Sides is 4");
    }
}
class Triangle extends Shape2{
    void numOfSides(){
        System.out.println("Triangle Sides is 3");
    }
}
class Hexagon extends Shape2{
    void numOfSides(){
        System.out.println("Hexagon Sides is 6");
    }
}
public class q13 {
    public static void main(String[] args) {
        Rectangle2 r=new Rectangle2();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        Shape2 rr;
        rr=r;
        rr.numOfSides();
        rr=t;
        rr.numOfSides();
        rr=h;
        rr.numOfSides();
    }
    
}
