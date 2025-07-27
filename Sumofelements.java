import java.util.Scanner;

public class Sumofelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] nos= new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            nos[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i=0;i<size;i++) {
            sum += nos[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

