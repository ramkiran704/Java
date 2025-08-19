import java.util.Scanner;
import java.lang.Math;
class Shape{
    int radius;
    int length;
    int breadth;
    int side1;
    int side2;
    int side3;
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
        double A=Math.sqrt(d);
        System.out.println("Area of triangle is :"+A);
    }
}
public class AreaofShapes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Shape s=new Shape();
        int choice;
        
        do{
        System.out.println("Enter 1:Circle,2:Rectangle,3:Triangle,4:Exit:");
        choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("Enter the Radius:");
                s.radius=sc.nextInt();
                s.Area(s.radius);
            case 2:System.out.println("Enter the length and Breadth:");
                s.length=sc.nextInt();
                s.breadth=sc.nextInt();
                s.Area(s.length,s.breadth);
            case 3:System.out.println("Enter the 3 sides of Triangle:");
                s.side1= sc.nextInt();
                s.side2= sc.nextInt();
                s.side3= sc.nextInt();
                s.Area(s.side1, s.side2, s.side3);
            case 4:break;
            default:System.out.println("Invalid Input");
        }
        } while(choice!=4);
        sc.close();
    }
}
