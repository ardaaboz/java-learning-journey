import java.util.ArrayList;
import java.util.Scanner;

public class GameWorld {

    // Creating ArrayLists
    private ArrayList<Item> allItems;
    private ArrayList<Character> allCharacters;

    // Create item
    public Item createItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Item creation menu-----");
        System.out.print("Item name: ");
        String nameInput = scanner.nextLine();
        System.out.print("Item type: ");
        String typeInput = scanner.nextLine();
        System.out.println("Item rarity: ");
        String rarityInput = scanner.nextLine();
        System.out.print("Item value: ");
        double valueInput = scanner.nextDouble();
        scanner.nextLine(); // Clear scanner after double / int
        System.out.print("Item weight: ");
        double weightInput = scanner.nextDouble();
        scanner.close();

        // Create item based on gathered information
        Item newItem = new Item(nameInput, typeInput, rarityInput, valueInput, weightInput);
        allItems.add(newItem);
        return newItem;
    }
    // Create Character
    public Character createCharacter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Character creation menu-----");
        System.out.print("Character name: ");
        String nameInput = scanner.nextLine();
        System.out.print("Character level: ");
        int levelInput = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Character weight carrying capacity: ");
        double weightCarryingCapacityInput = scanner.nextDouble();
        scanner.close();

        // Create item based on gathered information
        Character newCharacter = new Character(nameInput, levelInput, weightCarryingCapacityInput);
        allCharacters.add(newCharacter);
        return newCharacter;
    }

    // Search item methods

    // Search by name
    public ArrayList<Item> searchByName(String nameToSearch) {
        int matchCounter = 0;
        ArrayList<Item> searchResults = new ArrayList<>();
        for (Item item : allItems) {
            if (nameToSearch.equalsIgnoreCase(item.getName())) {
                searchResults.add(item);
                matchCounter++;
            }
        }
        System.out.println(matchCounter + " results found!");
        return searchResults;
    }

    // Search by type
    public ArrayList<Item> searchByType(String typeToSearch) {
        int matchCounter = 0;
        ArrayList<Item> searchResults = new ArrayList<>();
        for (Item item : allItems) {
            if (typeToSearch.equalsIgnoreCase(item.getType())) {
                searchResults.add(item);
                matchCounter++;
            }
        }
        System.out.println(matchCounter + " results found!");
        return searchResults;
    }

    // Search by rarity
    public ArrayList<Item> searchByRarity(String rarityToSearch) {
        int matchCounter = 0;
        ArrayList<Item> searchResults = new ArrayList<>();
        for (Item item : allItems) {
            if (rarityToSearch.equalsIgnoreCase(item.getRarity())) {
                searchResults.add(item);
                matchCounter++;
            }
        }
        System.out.println(matchCounter + " results found!");
        return searchResults;
    }

    // Trade items between characters
    public void tradeItems(Character givingCharacter, Character recievingCharacter, Item itemToTrade) {
        // Check if the giving character has the item to trade
        for (Item item: givingCharacter.itemArrayList) {
            if (item.equals(itemToTrade)) {
                recievingCharacter.addItem(itemToTrade); // Add the item to inventoru
                givingCharacter.removeItem(itemToTrade); // Remove the item from inventory
                System.out.println(givingCharacter.getName() + " gave the " + itemToTrade.getName() + " to " + recievingCharacter.getName());
            }
        }
    }

    // Display all items
    public void displayAllItems() {
        int itemCounter = 1;
        for (Item item: allItems) {
            System.out.println(itemCounter + ". item information");
            item.displayInformation();
        }
    }

    // Display all characters
    public void displayAllCharacter() {
        int characterCounter = 1;
        for (Character character: allCharacters) {
            System.out.println(characterCounter + ". character information");
            character.displayInformation();
        }
    }

    // Display specific character's inventory
    public void displaySpecificCharacterInventory (Character characterToDisplayInventory) {
        for (Item item: characterToDisplayInventory.itemArrayList) {
            item.displayInformation();
        }
    }
}
