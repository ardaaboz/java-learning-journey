# Homework Assignment: Shape Calculator

Create a program that uses polymorphism to calculate areas and perimeters of different shapes.

## Requirements

### Create an abstract class called `Shape` with:

- **Abstract methods:** `calculateArea()` and `calculatePerimeter()`
- A method `displayInfo()` that prints shape details including area and perimeter

### Create three concrete classes that extend `Shape`:

- **Circle:** Fields for `radius`
- **Rectangle:** Fields for `length` and `width`
- **Triangle:** Fields for the three sides

### Each concrete class should:

- Implement the abstract methods with the appropriate formulas
- Include a constructor to initialize fields
- Override the `toString()` method to return a string representation of the shape

### Create a `ShapeCalculator` class that:

- Has a method `printShapeInfo(Shape shape)` that uses polymorphism to print information about any shape
- Has a method `compareShapes(Shape shape1, Shape shape2)` that compares the areas of two shapes and states which is larger

### Create a `Main` class with a menu system to:

- Create different shapes with user input
- Display information about created shapes
- Compare two shapes
- Exit the program  
