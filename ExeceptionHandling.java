public class ExeceptionHandling {
    public static void divn(int a,int b){
        if(b==0){
            throw new ArithmeticException("DEmo");
        }
        else{
            int c=a/b;
            System.out.println(""+c+"");
        }
    }
    public static void main(String[] args) {
        try{
            divn(20,0);

        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        
        System.out.println("End of Program");
    }
    
}
