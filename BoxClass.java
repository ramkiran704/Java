class Box{
    double width;
    double height;
    double length;
    Box(){
        length=0;
        width=0;
        height=0;
    }
    Box(double w,double h,double l){
        width=w;
        height=h;
        length=l;
    }
    Box(double side){
        width=height=length=side;
    }
    double volume(){
        return width*length*height;
    }
    void display(){
        System.out.println("Length:"+" "+length);
        System.out.println("Width:"+" "+width);
        System.out.println("height:"+" "+height);
    }
}
public class BoxClass {
    public static void main(String[] agrs){
        Box ob1=new Box();
        Box ob2=new Box(12.0,11.0,13.0);
        Box ob3=new Box(10.0);   
        
        System.out.println("Default Constructor:");
        ob1.display();  
        System.out.println("Volume"+ob1.volume());
        System.out.println("Three Parameter:");
        ob2.display();  
        System.out.println("Volume"+ob2.volume());
        System.out.println("Single Parameter:");
        ob3.display();  
        System.out.println("Volume"+ob3.volume());
    }
}
