import java.util.Scanner;

public class DecimaltoBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int deci = scanner.nextInt();

    
        String bin= Integer.toBinaryString(deci);

        System.out.println("Binary representation: " + bin);

    }
}
