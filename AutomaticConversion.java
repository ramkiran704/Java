class overloadDemo1{
    void test(){
        System.out.println("No Parameter");
    }
    void test(double a){
        System.out.println("a:"+a);
    }
    void test(int a,int b){
        System.out.println("a and b:"+a+""+b);
    }
}
public class AutomaticConversion {
    public static void main(String[] args){
        overloadDemo1 ob=new overloadDemo1();
        ob.test();
        ob.test(22);
        ob.test(10,30);
    }
    
}
