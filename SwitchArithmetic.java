import java.util.Scanner;

public class SwitchArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Quotient");
        System.out.println("5. Remainder");

        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Difference = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Product = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Quotient = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            case 5:
                if (num2 != 0) {
                    System.out.println("Remainder = " + (num1 % num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }

        scanner.close();
    }
}
