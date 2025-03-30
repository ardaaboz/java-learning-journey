import java.util.Scanner;

public class Triangle extends Shape{

    // Encapsulated field
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Overriding methods
    @Override
    public double calculateArea(Scanner scanner) {
        System.out.println();
        System.out.println("Calculating area of a triangle");
        System.out.print("Please enter first side length: ");
        side1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter second side length: ");
        side2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter third side length: ");
        side3 = scanner.nextDouble();
        scanner.nextLine();

        double semiPerimeter = (side1 + side2 + side3) / 2;
        double result = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Result: " + result);
        return result;
    }

    @Override
    public double calculatePerimeter(Scanner scanner) {
        System.out.println();
        System.out.println("Calculating perimeter of a triangle");
        System.out.print("Please enter first side length: ");
        side1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter second side length: ");
        side2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter third side length: ");
        side3 = scanner.nextDouble();
        scanner.nextLine();

        double result = side1 + side2 + side3;
        System.out.println("Result: " + result);
        return result;
    }

    public String toString() {
        return "a triangle";
    }
}
