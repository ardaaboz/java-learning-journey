import java.util.Scanner;

public class Magazine extends LibraryItem{
    private String magazineIssueDate;
    private String magazinePublisher;
    public Magazine(String itemTitle, int itemId, boolean itemIsCheckedOut, String magazineIssueDate, String magazinePublisher) {
        super(itemTitle, itemId, itemIsCheckedOut);
        this.magazineIssueDate = magazineIssueDate;
        this.magazinePublisher = magazinePublisher;
    }

    @Override
    public void displayInfo() {
        System.out.println("");
        System.out.println("Magazine information:");
        System.out.println("Title: " + itemTitle);
        System.out.println("ID: " + itemId);
        System.out.println("Issue date: " + magazineIssueDate);
        System.out.println("Publisher: " + magazinePublisher);
        if (itemIsCheckedOut) {
            System.out.println("Item is checked out.");
        } else {
            System.out.println("Item is not checked out.");
        }
    }

    @Override
    public void createItem(Scanner scanner, Library library) {
        Magazine newMagazine = null;
        System.out.println("");
        System.out.println("Magazine creation:");
        System.out.print("Title: ");
        String newItemTitle = scanner.nextLine();
        System.out.print("ID: ");
        int newItemId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Issue date: ");
        String newMagazineIssueDate = scanner.nextLine();
        System.out.print("Publisher: ");
        String newMagazinePublisher = scanner.nextLine();
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
        newMagazine = new Magazine(newItemTitle,newItemId,newIsCheckedOut, newMagazineIssueDate, newMagazinePublisher);
        System.out.println("New magazine created!");
        library.addItem(newMagazine);
    }
}
