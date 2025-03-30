import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        boolean menuIsOn = true;

        while (menuIsOn) {
            System.out.println("\nWelcome to Shape Calculator");
            System.out.println("1. Create a shape");
            System.out.println("2. Display all shapes");
            System.out.println("3. Compare two shapes");
            System.out.println("4. Exit the program");
            int menuInput = scanner.nextInt();
            scanner.nextLine();

            switch (menuInput) {
                case 1: // region
                    System.out.println("What type of shape would you like to create?");
                    System.out.println("Circle / Rectangle / Triangle");
                    String shapeInput = scanner.nextLine();

                    if (shapeInput.equalsIgnoreCase("Circle")) {
                        System.out.print("Please enter radius: ");
                        double radiusInput = scanner.nextDouble();
                        scanner.nextLine();

                        Circle newCircle = new Circle(radiusInput);
                        shapeArrayList.add(newCircle);
                        System.out.println("New circle created!");
                    } else if (shapeInput.equalsIgnoreCase("Rectangle")) {
                        System.out.print("Please enter length: ");
                        double lengthInput = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Please enter width: ");
                        double widthInput = scanner.nextDouble();
                        scanner.nextLine();

                        Rectangle newRectangle = new Rectangle(lengthInput,widthInput);
                        shapeArrayList.add(newRectangle);
                        System.out.println("New rectangle created!");
                    } else if (shapeInput.equalsIgnoreCase("Triangle")) {
                        System.out.print("Please enter first side: ");
                        double firstSideInput = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Please enter second side: ");
                        double secondSideInput = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Please enter third side: ");
                        double thirdSideInput = scanner.nextDouble();
                        scanner.nextLine();

                        Triangle newTriangle = new Triangle(firstSideInput,secondSideInput,thirdSideInput);
                        shapeArrayList.add(newTriangle);
                        System.out.println("New triangle created!");
                    } else {
                        System.out.println("Please enter a valid shape!");
                    }
                    break; // endregion
                case 2:
                    if (!shapeArrayList.isEmpty()) {
                        for (Shape shape: shapeArrayList) {
                            System.out.println();
                            shape.toString();
                            int index = 0;
                            System.out.println("Index: " + index);
                            index++;
                        }
                    } else {
                        System.out.println("You didn't create any shapes yet!");
                    }
                    break;
                case 3:
                    if (!shapeArrayList.isEmpty()) {
                        System.out.println("\nComparing shapes");
                        System.out.println("Enter the index of the first shape");
                        int firstShapeIndex = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the index of the second shape");
                        int secondShapeIndex = scanner.nextInt();
                        scanner.nextLine();

                        Shape firstShape = shapeArrayList.get(firstShapeIndex);
                        Shape secondShape = shapeArrayList.get(secondShapeIndex);
                        shapeCalculator.compareShapes(scanner, firstShape, secondShape);
                    } else {
                        System.out.println("You didn't create any shapes yet!");
                    }
                    break;
                case 4:
                    menuIsOn = false;
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nEnter a valid input!");
                    break;
            }
        }
    }
}

