import java.util.Scanner;

public class Book extends LibraryItem {
    private String bookAuthor;
    private int bookNumPages;
    public Book(String itemTitle, int itemId, boolean itemIsCheckedOut, String bookAuthor, int bookNumPages) {
        super(itemTitle, itemId, itemIsCheckedOut);
        this.bookAuthor = bookAuthor;
        this.bookNumPages = bookNumPages;
    }

    @Override
    public void displayInfo() {
        System.out.println("");
        System.out.println("Book information:");
        System.out.println("Title: " + itemTitle);
        System.out.println("ID: " + itemId);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Pages: " + bookNumPages);
        if (itemIsCheckedOut) {
            System.out.println("Item is checked out.");
        } else {
            System.out.println("Item is not checked out.");
        }
    }

    @Override
    public void createItem(Scanner scanner, Library library) {
        Book newBook = null;
        System.out.println("");
        System.out.println("Book creation:");
        System.out.print("Title: ");
        String newItemTitle = scanner.nextLine();
        System.out.print("ID: ");
        int newItemId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Author: ");
        String newBookAuthor = scanner.nextLine();
        System.out.print("Pages: ");
        int newBookNumPages = scanner.nextInt();
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
        newBook = new Book(newItemTitle,newItemId,newIsCheckedOut, newBookAuthor, newBookNumPages);
        System.out.println("New book created!");
        library.addItem(newBook);
    }
}
