import java.util.Scanner;
import java.lang.Math;
class Shape{
    int radius;
    int length;
    int breadth;
    int base;
    int height;
    void Area(int radius){
        double A=3.14*radius*radius;
        System.out.println("Area of Circle is:"+A);
    }
    void Area(int length,int breadth){
        double A=length*breadth;
        System.out.println("Area of Rectangle is :"+A);
    }
    void Area(int side1,int side2,int side3){
        double S=(side1+side2+side3)/2;
        double d=S*(S-side1)*(S-side2)*(S-side3);
        double A=Math.pow(d,0.5);
        System.out.println("Area of triangle is :"+A);
    }
}
public class AreaofShapes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Shape s=new Shape();
        System.out.println("Enter the Radius:");
        int s.radius=sc.nextInt();
        System.out.println("Enter the length and Breadth:");
        int s.length=sc.nextInt();
        int s.breadth=sc.nextInt();
        
    }
}
