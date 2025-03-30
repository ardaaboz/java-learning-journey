import java.util.Scanner;

public class ShapeCalculator {

    public void compareShapes (Scanner scanner, Shape shape1, Shape shape2) {
        double shape1Area = shape1.calculateArea(scanner);
        double shape2Area = shape2.calculateArea(scanner);

        System.out.println("First shape area: " + shape1Area);
        System.out.println("Second shape area: " + shape2Area);
        if (shape1Area == shape2Area) {
            System.out.println("Both are the same!");
        } else if (shape1Area > shape2Area) {
            System.out.println("First shape is bigger!");
        } else {
            System.out.println("Second shape is bigger!");
        }
    }
}
