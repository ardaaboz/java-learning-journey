import java.lang.reflect.Array;
import java.util.Scanner;

public class PetOwner {

    // Field declaration with encapsulation
    private String name;
    private Pet[] petsArray = new Pet[3]; // Declaring Array of pets with maximum 3 allowed
    private int currentPetCount;
    int index = 0;

    // Constructor
    public PetOwner(String name) {
        this.name = name;
    }

    // Get and set method for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }
    // Methods
    public void addPet(Pet petToAdd) {
        if (currentPetCount <= 3) {
            petsArray[index] = petToAdd;
            currentPetCount++;
            index++;
        } else {
            System.out.println("You can't have more pets!");
        }
    }

    public void displayAllPets() {
        if (currentPetCount > 0) {
            int petNumber = 1;
            for (Pet currentPet : petsArray) {
                if (currentPet != null) {
                    System.out.println(petNumber + ". Pet:");
                    currentPet.displayInfo();
                    petNumber++;
                }
            }
        } else {
            System.out.println("You don't have any pets yet!");
        }
    }

    public void feedAllPets () {
        if (currentPetCount > 0) {
            for (int i = 0; i < currentPetCount; i++) {
                petsArray[i].feedPet();
            }
        } else {
            System.out.println("You don't have any pets yet!");
        }
    }

}
