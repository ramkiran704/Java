import java.util.Scanner;

public class DecimaltoBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int deci = scanner.nextInt();
        String reverse="";

    
        String bin= Integer.toBinaryString(deci);
        reverse=new StringBuilder(bin).reverse().toString();

        System.out.println("Binary representation: " + bin);
        System.out.println("Reversed Binary :"+ reverse);
        scanner.close();
    }
}
