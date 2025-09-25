import java.util.Scanner;

public class DVD extends LibraryItem{
    private String dvdDirector;
    private int dvdRunningTime;
    public DVD(String itemTitle, int itemId, boolean itemIsCheckedOut, String dvdDirector, int dvdRunningTime) {
        super(itemTitle, itemId, itemIsCheckedOut);
        this.dvdDirector = dvdDirector;
        this.dvdRunningTime = dvdRunningTime;
    }

    @Override
    public void displayInfo() {
        System.out.println("");
        System.out.println("DVD information:");
        System.out.println("Title: " + itemTitle);
        System.out.println("ID: " + itemId);
        System.out.println("Director: " + dvdDirector);
        System.out.println("Running time: " + dvdRunningTime);
        if (itemIsCheckedOut) {
            System.out.println("Item is checked out.");
        } else {
            System.out.println("Item is not checked out.");
        }
    }

    @Override
    public void createItem(Scanner scanner, Library library) {
        DVD newDVD = null;
        System.out.println("");
        System.out.println("DVD creation:");
        System.out.print("Title: ");
        String newItemTitle = scanner.nextLine();
        System.out.print("ID: ");
        int newItemId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Director: ");
        String newDVDDirector = scanner.nextLine();
        System.out.print("Running time: ");
        int newDVDRunningTime = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Is item checked out? (Y/N)");
        char checkedOutInput = scanner.nextLine().toUpperCase().charAt(0);
        boolean newIsCheckedOut = false;
        switch (checkedOutInput) {
            case 'Y':
                newIsCheckedOut = true;
                break;
            case 'N':
                newIsCheckedOut = false;
                break;
            default:
                System.out.println("Enter a valid input!");
                break;
        }
        newDVD = new DVD(newItemTitle,newItemId,newIsCheckedOut, newDVDDirector, newDVDRunningTime);
        System.out.println("New DVD created!");
        library.addItem(newDVD);
    }
}
