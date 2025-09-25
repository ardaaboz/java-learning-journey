import java.util.Scanner;

public class SafeDivisionCalcualtor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int int1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter second integer: ");
        int int2 = scanner.nextInt();
        scanner.nextLine();

        try {
            int result = int1 / int2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("You can't divide by zero! You got this error: " + arithmeticException.getMessage());
        } finally {
            System.out.println("Operation complete!");
        }
    }
}
