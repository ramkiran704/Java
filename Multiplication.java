import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter any number:");
        int n=scanner.nextInt();

        System.out.println("Multiplication Table of" + n);
        for(int i=1;i<=10;i++){
            System.out.println(i + "x" + n + "=" + i * n);
        }
    }
}
