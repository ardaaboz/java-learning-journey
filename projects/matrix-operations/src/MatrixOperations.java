import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Asking for dimensions of matrices
        System.out.println("Enter the first matrix's dimensions");
        System.out.print("Rows: ");
        int firstMatrixRowAmount = scanner.nextInt();
        System.out.print("Columns: ");
        int firstMatrixColumnAmount = scanner.nextInt();

        System.out.println("Enter the second matrix's dimensions");
        System.out.print("Rows: ");
        int secondMatrixRowAmount = scanner.nextInt();
        System.out.print("Columns: ");
        int secondMatrixColumnAmount = scanner.nextInt();

        // Asking for random/custom matrices
        System.out.println("Would you like to: ");
        System.out.println("1. Create random matrices");
        System.out.println("2. Create custom matrices");
        int randomCustom = scanner.nextInt();
        int[][] matrix1 = new int[firstMatrixRowAmount][firstMatrixColumnAmount];
        int[][] matrix2 = new int[secondMatrixRowAmount][secondMatrixColumnAmount];
        switch (randomCustom) {
            case 1:

                // Asking for random number ranges
                System.out.println("Enter the range of random numbers you would like: ");
                System.out.print("Minimum: ");
                int minimumRandom = scanner.nextInt();
                System.out.print("Maximum: ");
                int maximumRandom = scanner.nextInt();

                Random random = new Random();

                // Create first random matrix
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        int randomNumber = random.nextInt(maximumRandom - minimumRandom + 1) + minimumRandom;
                        matrix1[i][j] = randomNumber;
                    }
                }

                // Create second random matrix
                for (int i = 0; i < matrix2.length; i++) {
                    for (int j = 0; j < matrix2[i].length; j++) {
                        int randomNumber = random.nextInt(maximumRandom - minimumRandom + 1) + minimumRandom;
                        matrix2[i][j] = randomNumber;
                    }
                }
                break;
            case 2:
                // Create first custom matrix
                System.out.println("First matrix: ");
                for (int i = 0; i < matrix1.length; i++) {
                    for (int j = 0; j < matrix1[i].length; j++) {
                        System.out.print("Enter the value for row " + (i+1) + ", column " + (j+1) + ": ");
                        int input = scanner.nextInt();
                        matrix1[i][j] = input;
                    }
                }

                // Create second custom matrix
                System.out.println("Second matrix: ");
                for (int i = 0; i < matrix2.length; i++) {
                    for (int j = 0; j < matrix2[i].length; j++) {
                        System.out.print("Enter the value for row " + (i+1) + ", column " + (j+1) + ": ");
                        int input = scanner.nextInt();
                        matrix2[i][j] = input;
                    }
                }
                break;
            default:
                System.out.println("Enter a valid input!");
                break;
        }

        // Results
        System.out.println("Printing first matrix: ");
        printMatrix(matrix1);
        System.out.println("Printing second matrix: ");
        printMatrix(matrix2);
        System.out.println("Merging matrices...");
        mergeMatrix(matrix1, matrix2);
        System.out.println("Sum of first matrix: " + sumOfMatrix(matrix1));
        System.out.println("Sum of second matrix: " + sumOfMatrix(matrix2));
        System.out.println("Max of first matrix: " + maxOfMatrix(matrix1));
        System.out.println("Max of second matrix: " + maxOfMatrix(matrix2));




    }
    public static void printMatrix(int[][] matrix1) {
        int matrixColumnLength = matrix1[0].length;
        int matrixRowLength = matrix1.length;
        for (int i = 0; i < matrixRowLength; i++) {
            for (int j = 0; j < matrixColumnLength; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mergeMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            int matrixColumnLength = matrix1[0].length;
            int matrixRowLength = matrix1.length;
            for (int i = 0; i < matrixRowLength; i++) {
                for (int j = 0; j < matrixColumnLength; j++) {
                    System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix sizes do not match!");
        }
    }
    public static int sumOfMatrix(int[][] matrix1) {
        int matrixColumnLength = matrix1[0].length;
        int matrixRowLength = matrix1.length;
        int sum = 0;
        for (int i = 0; i < matrixRowLength; i++) {
            for (int j = 0; j < matrixColumnLength; j++) {
                sum += matrix1[i][j];
            }
        }
        return sum;
    }
    public static int maxOfMatrix(int[][] matrix1) {
        int matrixColumnLength = matrix1[0].length;
        int matrixRowLength = matrix1.length;
        int max = matrix1[0][0];
        for (int i = 0; i < matrixRowLength; i++) {
            for (int j = 0; j < matrixColumnLength; j++) {
                if (max < matrix1[i][j]) {
                    max = matrix1[i][j];
                }
            }
        }
        return max;
    }
}