class mathOpertions{
    int a,b,c;
    void add(int a,int b){
        System.out.println("Sum of Two Integers:"+(a+b));
    }
    void add(double a,double b){
        System.out.println("Sum of Double Number:"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of Three Integers:"+(c+a+b));
    }
}
public class MathOperations {
    public static void main(String[] args){
        mathOpertions ob=new mathOpertions();
        ob.add(1,3);
        ob.add(20.0, 10.0);
        ob.add(1,2 , 3);
    }
    
}
