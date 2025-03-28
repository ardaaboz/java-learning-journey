import java.util.Scanner;
public abstract class Shape {

    // Abstract methods
    public abstract double calculateArea(Scanner scanner);
    public abstract double calculatePerimeter(Scanner scanner);

    // Concrete method
    public void displayInfo(Scanner scanner) {
        System.out.println();
        System.out.println("Shape information");
        System.out.println("Area: " + calculateArea(scanner));
        System.out.println("Perimeter: " + calculatePerimeter(scanner));
    }
}
