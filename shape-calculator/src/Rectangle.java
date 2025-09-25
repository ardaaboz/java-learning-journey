import java.util.Scanner;

public class Rectangle extends Shape{

    // Encapsulated fields
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding methods
    @Override
    public double calculateArea(Scanner scanner) {
        System.out.println();
        System.out.println("Calculating area of a rectangle");
        System.out.print("Please enter length: ");
        length = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter width: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        double result = width * length;
        System.out.println("Result: " + result);
        return result;
    }

    public double calculatePerimeter(Scanner scanner) {
        System.out.println();
        System.out.println("Calculating area of a rectangle");
        System.out.print("Please enter length: ");
        length = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter width: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        double result = (length+length) + (width+width);
        System.out.println("Result: " + result);
        return result;
    }

    public String toString() {
        return "a rectangle";
    }
}
