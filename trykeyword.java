
public class trykeyword {
    static void demo() throws ArithmeticException{
        try{
            int a=4/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Caught and throwing ");
            throw(e);
        }
        finally{
            System.out.println("Ended");
        } 
    }
    public static void main(String[] args){

        try{
            demo();
        }
        catch(ArithmeticException e){
            System.out.println("Caught in main");
        }
    }
}
