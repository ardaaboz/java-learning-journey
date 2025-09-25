import java.util.Scanner;

public class Circle extends Shape{

    // Encapsulated field
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding methods
    @Override
    public double calculateArea(Scanner scanner) {
        System.out.println();
        System.out.println("Calculating area of a circle");
        System.out.print("Please enter radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine();

        double result = (radius * radius) * Math.PI;
        System.out.println("Result: " + result);
        return result;
    }

    @Override
    public double calculatePerimeter(Scanner scanner) {
        System.out.println();
        System.out.println("Calculating area of a circle");
        System.out.print("Please enter radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine();
        double result = 2 * Math.PI * radius;
        System.out.println("Result: " + result);
        return result;
    }

    @Override
    public String toString() {
        return "a circle";
    }
}
