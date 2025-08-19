import java.util.Scanner;
public class Ifcondition {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num=scanner.nextInt();

        if(num==0){
            System.out.println(num+" Is Zero");
        }
        else if(num>0){
            System.out.println(num+" Is Positive Number");
        }
        else{
            System.out.println(num+" Is Negative Number");
        }
        scanner.close();
    }
}
