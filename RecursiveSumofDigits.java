import java.util.Scanner;
public class RecursiveSumofDigits {
    
    static int digitSum(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int transactionID = sc.nextInt();

        int checksum = digitSum(transactionID);

        System.out.println("Sum of digits " + checksum);
        sc.close();
    }
}
