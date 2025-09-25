import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Library library = new Library();

    public static void main(String[] args) {
        Book book1 = new Book("Nutuk",1,false,"Ataturk",1187);
        DVD dvd1 = new DVD("Lord of the Rings", 2,true,"Peter Jackson", 178);
        Magazine magazine1 = new Magazine("National Geographic", 42, false, "2023-09-15", "National Geographic Society");

        library.addItem(book1);
        library.addItem(dvd1);
        library.addItem(magazine1);

    boolean menuIsOn = true;
        while (menuIsOn) {
            System.out.println("");
            System.out.println("Welcome to Library Manager!");
            System.out.println("1. Display all items");
            System.out.println("2. Check out an item");
            System.out.println("3. Return an item");
            System.out.println("4. Create an item");
            System.out.println("5. Exit");
            int menuInput = scanner.nextInt();
            scanner.nextLine();

            switch (menuInput) {
                case 1:
                    library.displayALlItems();
                    break;
                case 2:
                    library.checkOutItem(scanner);
                    break;
                case 3:
                    library.returnItem(scanner);
                    break;
                case 4:
                    createLibraryItem(scanner);
                    break;
                case 5:
                    menuIsOn = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter a valid input!");
                    break;
            }
        }
    }
    public static void createLibraryItem(Scanner scanner){
        System.out.println("");
        System.out.println("What kind of item would you like to create?");
        System.out.println("Book/DVD/Magazine");
        String itemCategory = scanner.nextLine();

        if (itemCategory.equalsIgnoreCase("Book")) {
            Book book = new Book("",0,false,"",0);
            book.createItem(scanner, library);
        } else if (itemCategory.equalsIgnoreCase("DVD")) {
            DVD dvd = new DVD("",0,false,"",0);
            dvd.createItem(scanner, library);
        } else {
            Magazine magazine = new Magazine("",0,false,"","");
            magazine.createItem(scanner, library);
        }
    }
}
