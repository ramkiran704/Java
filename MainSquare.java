class Square{
    int length;
    Square(int length){
        this.length=length;
    }
    void displayArea(){
        int areaS=length*length;
        System.out.println("Area"+areaS);
    }
}
class Rectangle extends Square{
    
    int breadth;
    Rectangle(int length,int breadth){
        super(length);
        this.breadth=breadth;
    }
    void displayArea(){
        int areaR=breadth*length;
        System.out.println("Area of Rectangle:"+areaR);
    }
}
public class MainSquare {
    public static void main(String[] args){
        Square s=new Square(2);
        s.displayArea();
        Rectangle r=new Rectangle(3, 5);
        r.displayArea();
    }
}
