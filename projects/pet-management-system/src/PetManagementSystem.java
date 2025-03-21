import java.util.Scanner;

public class PetManagementSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pet Management System!");
        System.out.print("Please enter your name: ");
        String userNameInput = scanner.nextLine();
        PetOwner userPetOwner = new PetOwner(userNameInput);

        System.out.println("How many pets would you like to add to your account?");
        int userPetAmountInput = scanner.nextInt();
        scanner.nextLine();  // Consume leftover newline

        if (userPetAmountInput > 0 && userPetAmountInput < 4) {
            for (int i = 0; i < userPetAmountInput; i++) {
                System.out.println(i + 1 + ". Pet: ");
                System.out.print("Enter the name of your pet: ");
                String userPetNameInput = scanner.nextLine();
                System.out.print("Enter the type of your pet: ");
                String userPetTypeInput = scanner.nextLine();
                System.out.print("Enter the age of your pet: ");
                int userPetAgeInput = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter the weight of your pet: ");
                double userPetWeightInput = scanner.nextDouble();
                scanner.nextLine();

                userPetOwner.addPet(new Pet(userPetNameInput,userPetTypeInput,userPetAgeInput,userPetWeightInput));
            }

            boolean menuIsOn = true;

            while (menuIsOn) {
                System.out.println("What would you like to do?");
                System.out.println("1. Display all pets");
                System.out.println("2. Feed all pets");
                System.out.println("3. Exit");
                int userMenuInput = scanner.nextInt();
                scanner.nextLine();

                switch (userMenuInput) {
                    case 1:
                        userPetOwner.displayAllPets();
                        break;
                    case 2:
                        userPetOwner.feedAllPets();
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        menuIsOn = false;
                        break;
                    default:
                        System.out.println("Enter a valid input!");
                        break;
                }
            }
        } else {
            System.out.println("You can't have more than three pets!");
        }
    }
}