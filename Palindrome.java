import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter Any number:");
        int n=scanner.nextInt();
        int num=n;
        int reverse=0;

        while (n!=0){
            int d=n%10;
            reverse=reverse*10+d;
            n=n/10;
        }

        if(num==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
