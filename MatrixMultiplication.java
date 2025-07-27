import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows of Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter rows of Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int colsB = scanner.nextInt();
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
            return;
        }
        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("\nProduct of Matrix A and B:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
