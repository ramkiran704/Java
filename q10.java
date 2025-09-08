class Shape1{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}
class Circle extends Shape1{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Rectangle1 extends Shape1{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
public class q10 {
    public static void main(String[] args){
        Shape1 c=new Circle();
        Shape1 r=new Rectangle1();
        c.draw();
        r.draw();
    }
}
