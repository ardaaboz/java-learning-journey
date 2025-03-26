import java.util.Scanner;

public class LibraryItem {
    protected String itemTitle;
    protected int itemId;
    protected boolean itemIsCheckedOut;

    LibraryItem(String itemTitle, int itemId, boolean itemIsCheckedOut) {
        this.itemTitle = itemTitle;
        this.itemId = itemId;
        this.itemIsCheckedOut = itemIsCheckedOut;
    }

    public void checkOut() {
        itemIsCheckedOut = true;
        System.out.println(itemTitle + " is checked out.");
    }

    public void returnItem() {
        itemIsCheckedOut = false;
        System.out.println(itemTitle + " is returned.");
    }

    public void createItem(Scanner scanner, Library library) {
        LibraryItem newItem = null;
        System.out.println("");
        System.out.println("Item creation:");
        System.out.print("Title: ");
        String newItemTitle = scanner.nextLine();
        System.out.print("ID: ");
        int newItemId = scanner.nextInt();
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
        newItem = new LibraryItem(newItemTitle, newItemId, newIsCheckedOut);
        System.out.println("New Item created!");
        library.addItem(newItem);
    }

    public void displayInfo() {
        System.out.println("");
        System.out.println("Item information:");
        System.out.println("Title: " + itemTitle);
        System.out.println("ID: " + itemId);
        if (itemIsCheckedOut) {
            System.out.println("Item is checked out.");
        } else {
            System.out.println("Item is not checked out.");
        }
    }
}
