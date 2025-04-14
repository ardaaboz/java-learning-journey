import java.io.*;
import java.util.Scanner;

public class ContactManager {
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("contacts.txt");
    static String filePath = "contacts.txt";

    public static void main(String[] args) {
        boolean mainMenuIsOn = true;
        while (mainMenuIsOn) {
            System.out.println("\nContact Manager");
            System.out.println("1. Add new contacts");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display all contacts");
            System.out.println("4. Exit");

            int menuInput = scanner.nextInt();
            scanner.nextLine();

            switch (menuInput) {
                case 1:
                    addContact(scanner,filePath);
                    break;
                case 2:
                    findContact(scanner,filePath);
                    break;
                case 3:
                    displayAllContacts(scanner,filePath);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    mainMenuIsOn = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Enter a valid input!");
                    break;
            }
        }
    }
    public static void addContact(Scanner scanner, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("\nPlease enter the contact information as name, phone number, email");
                String contactInput = scanner.nextLine();
                writer.write(contactInput);
                writer.newLine();
                System.out.println("Contact added successfully!");
                System.out.println("\nWould you like to add another contact? Y/N");
                String yesNoInput = scanner.nextLine().toUpperCase();
                switch (yesNoInput.charAt(0)) {
                    case 'Y':
                        isRunning = true;
                        break;
                    case 'N':
                        System.out.println("Opeartion finished!");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Enter a valid input!");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void findContact(Scanner scanner, String filePath) {
        System.out.println("Please enter the name to search for");
        String searchInput = scanner.nextLine().toLowerCase();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].toLowerCase().contains(searchInput)) {
                    found = true;
                    System.out.println("Found result: ");
                    System.out.println("Name: " + parts[0] + " Number: " + parts[1] + " Email: " + parts[2]);
                }
            }
            if (!found) {
                System.out.println("There is no matching results!");
            }
        }  catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void displayAllContacts(Scanner scanner, String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("\n" + line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
