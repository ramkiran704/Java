class overloadDemo{
    void test(){
        System.out.println("No Parameter");
    }
    void test(int a){
        System.out.println("a:"+a);
    }
    void test(int a,int b){
        System.out.println("a and b:"+a+""+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        overloadDemo ob=new overloadDemo();
        ob.test();
        ob.test(20);
        ob.test(10,30);
    }
}
