// Import scanner
import java.util.Scanner;

public class SimpleCalculator {
    public static double firstNumber = 0;
    public static double secondNumber = 0;

    public static void main(String[] args) {

        double result;

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Display and control menu
        boolean keepRunning = true;
        while (keepRunning == true) {
            System.out.println("Welcome to Simple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Divison");
            System.out.println("4. Multiplication");
            System.out.println("5. Exit");
            System.out.println("Select the desired option: ");
            int menuInput = scanner.nextInt();

            // Options
            switch (menuInput) {
                case 1:
                    numberInput(scanner);
                    result = addition(firstNumber, secondNumber);
                    System.out.println("Result: " + result + "\n");
                    break;
                case 2:
                    numberInput(scanner);
                    result = substraction(firstNumber, secondNumber);
                    System.out.println("Result: " + result + "\n");
                    break;
                case 3:
                    numberInput(scanner);
                    result = division(firstNumber, secondNumber);
                    System.out.println("Result: " + result + "\n");
                    break;
                case 4:
                    numberInput(scanner);
                    result = multiplication(firstNumber, secondNumber);
                    System.out.println("Result: " + result + "\n");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid input!");
                    break;
            }
        }
    }
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double substraction(double num1, double num2) {
        return num1 - num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static void numberInput(Scanner scanner) {
        System.out.println("Please enter the first number ");
        firstNumber = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        secondNumber = scanner.nextDouble();
        return;
    }
}
