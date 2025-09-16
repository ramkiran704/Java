import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 5;     
        int subjects = 3;     

        int[] rollNumbers = new int[students];
        double[] averages = new double[students];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter roll number of student " + (i + 1) + ": ");
            rollNumbers[i] = sc.nextInt();

            int sum = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks in subject " + (j + 1) + " (out of 100): ");
                int marks = sc.nextInt();
                sum += marks;
            }

            averages[i] = sum / (double) subjects;  
        }

        System.out.println("\nRoll Number and Average Marks of Students:");
        for (int i = 0; i < students; i++) {
            System.out.println("Roll No: " + rollNumbers[i] + " | Average Marks: " + averages[i]);
        }

        sc.close();
    }
}