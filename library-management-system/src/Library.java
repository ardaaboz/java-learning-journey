import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<LibraryItem> allLibraryItemsArrayList;
    public Library() {
        this.allLibraryItemsArrayList = new ArrayList<>();
    }
    public void addItem(LibraryItem item) {
        allLibraryItemsArrayList.add(item);
    }

    public void displayALlItems() {
        for (LibraryItem libraryItem: allLibraryItemsArrayList) {
            libraryItem.displayInfo();
        }
    }

    public void checkOutItem(Scanner scanner) {
        System.out.println("");
        System.out.print("Enter the ID of the item you would like to check out: ");
        int idToSearch = scanner.nextInt();
        boolean itemFound = false;

        for (LibraryItem item: allLibraryItemsArrayList) {
            if (idToSearch == item.itemId) {
                item.checkOut();
                itemFound = true;
                System.out.println("Item checked out!");
            }
        }
        if (!itemFound) {
            System.out.println("Item not found!");
        }
    }

    public void returnItem(Scanner scanner) {
        System.out.println("");
        System.out.print("Enter the ID of the item you would like to return: ");
        int idToSearch = scanner.nextInt();
        boolean itemFound = false;

        for (LibraryItem item: allLibraryItemsArrayList) {
            if (idToSearch == item.itemId) {
                item.returnItem();
                itemFound = true;
                System.out.println("Item returned");
            }
        }
        if (!itemFound) {
            System.out.println("Item not found!");
        }
    }


}
