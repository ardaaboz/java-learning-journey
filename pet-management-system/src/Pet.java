import java.util.Scanner;

public class Pet {

    // Field declaration with encapsulation
    private String name;
    private String type;
    private int age;
    private double weight;

    // Constructor
    public Pet(String name, String type, int age, double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    // Setter methods
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        }
    }
    public void setAge(int age) {
        if (age >= 0 && age < 100) {
            this.age = age;
        }
    }
    public void setWeight(double weight) {
        if (weight > 0 && weight < 1000) {
            this.weight = weight;
        }
    }

    // Other methods
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight + " kg");
    }
    public void feedPet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many grams of food would you like to give to the pet?");
        double feedingAmount = scanner.nextDouble();
        scanner.nextLine();

        if (feedingAmount > 0) {
             this.weight += feedingAmount/1000; // Converting grams to kilograms
        } else {
            System.out.println("You can't take food from the pet!");
        }
        System.out.println("New weight after feeding: " + this.weight);
        scanner.close();
    }
}
