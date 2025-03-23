import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {
    public static void main(String[] args) {
        //  Create new game world
        GameWorld gameWorld = new GameWorld();

        //region Create new items
        Item item1 = new Item("Iron Sword", "Sword", "Common", 300, 10);
        Item item2 = new Item("Wooden Shield", "Shield", "Common", 200, 2);
        Item item3 = new Item("Long Bow", "Bow", "Uncommon", 400, 9);
        Item item4 = new Item("Leather Armor", "Armor", "Common", 250, 0);
        Item item5 = new Item("Battle Sword", "Sword", "Rare", 700, 15);

        gameWorld.allItems.add(item1);
        gameWorld.allItems.add(item2);
        gameWorld.allItems.add(item3);
        gameWorld.allItems.add(item4);
        gameWorld.allItems.add(item5);
        //endregion

        //region Create new characters
        Character character1 = new Character("Arda", 19, 180);
        Character character2 = new Character("Linh", 20, 200);
        Character character3 = new Character("Umit Ozdag", 99, 300);

        gameWorld.allCharacters.add(character1);
        gameWorld.allCharacters.add(character2);
        gameWorld.allCharacters.add(character3);
        //endregion

        //region Create character inventories
        character1.addItem(item4);
        character2.addItem(item1); character2.addItem(item2);
        character3.addItem(item3); character3.addItem(item4); character3.addItem(item5);
        //endregion

        // Menu
        boolean menuIsOn = true;
        while (menuIsOn) {
            System.out.println("\n-----Welcome to the game!-----");
            System.out.println("1. View all available items");
            System.out.println("2. View all characters");
            System.out.println("3. Create a new item");
            System.out.println("4. Add items to a character's inventory");
            System.out.println("5. Remove items from a character's inventory");
            System.out.println("6. Trade items between characters");
            System.out.println("7. Exit");
            Scanner scanner = new Scanner(System.in);
            int menuInput = scanner.nextInt();
            scanner.nextLine();

            switch (menuInput) {
                case 1:
                    gameWorld.displayAllItems();
                    break;
                case 2:
                    gameWorld.displayAllCharacters();
                    break;
                case 3:
                    gameWorld.createItem(scanner);
                    break;
                case 4: //region
                    System.out.println("Which item you would like to add?");
                    String itemInput = scanner.nextLine();
                    boolean itemFound = false;
                    boolean characterFound = false;
                    Item itemToAdd = null;
                    for (Item item: gameWorld.allItems) {
                        if (itemInput.equalsIgnoreCase(item.getName())) {
                            itemFound = true;
                            itemToAdd = item;
                        }
                    }
                    if (itemFound) {
                        System.out.println("Which character would you like to add the item?");
                        String characterInput = scanner.nextLine();
                        characterFound = false;
                        for (Character character: gameWorld.allCharacters) {
                            if (characterInput.equalsIgnoreCase(character.getName())) {
                                characterFound = true;
                                character.addItem(itemToAdd);
                                System.out.println(itemToAdd.getName() + " added to " + character.getName() + "'s inventory!");
                            }
                        }
                        if (!characterFound) {
                            System.out.println("Character not found!");
                        }
                    } else {
                        System.out.println("Item not available!");
                    }
                    break; //endregion
                case 5: //region
                    System.out.println("Which item you would like to remove?");
                    itemInput = scanner.nextLine();
                    itemFound = false;
                    Item itemToRemove = null;
                    for (Item item: gameWorld.allItems) {
                        if (itemInput.equalsIgnoreCase(item.getName())) {
                            itemFound = true;
                            itemToRemove = item;
                        }
                    }
                    if (itemFound) {
                        System.out.println("Which character would you like to remove this item from?");
                        String characterInput = scanner.nextLine();
                        characterFound = false;
                        Character characterToRemoveItemFrom = null;
                        for (Character character: gameWorld.allCharacters) {
                            if (characterInput.equalsIgnoreCase(character.getName())) {
                                characterFound = true;
                                characterToRemoveItemFrom = character;
                            }
                        }
                        if (characterFound) {
                            for (Item item: characterToRemoveItemFrom.itemArrayList) {
                                if (item.getName().equalsIgnoreCase(itemToRemove.getName())) {
                                    characterToRemoveItemFrom.removeItem(itemToRemove);
                                    System.out.println(itemToRemove.getName() + " was removed from " + characterToRemoveItemFrom.getName() + "'s inventory!");
                                    break;
                                } else {
                                    System.out.println("Item couldn't be found inside character's inventory");
                                }
                            }
                        } else {
                            System.out.println("Character not found!");
                        }
                    } else {
                        System.out.println("Item not available!");
                    }
                    break; //endregion
                case 6: //region
                    System.out.println("----Trade Menu-----");
                    System.out.println("Which item you would like to trade?");
                    String itemToTradeInput = scanner.nextLine();
                    itemFound = false;
                    boolean givingCharacterFound = false;
                    boolean recievingCharacterFound = false;
                    Item itemToTrade = null;
                    Character givingCharacter = null;
                    Character recievingCharacter = null;
                    for (Item item: gameWorld.allItems) {
                        if (item.getName().equalsIgnoreCase(itemToTradeInput)) {
                            itemFound = true;
                            itemToTrade = item;
                            break;
                        }
                    }
                    if (itemFound) {
                        System.out.println("Which character will be giving the item?");
                        String characterInput = scanner.nextLine();
                        for (Character character : gameWorld.allCharacters) {
                            if (character.getName().equalsIgnoreCase(characterInput)) {
                                givingCharacterFound = true;
                                givingCharacter = character;
                            }
                        }
                        if (givingCharacterFound) {
                            System.out.println("Which character will be recieving the item?");
                            characterInput = scanner.nextLine();
                            for (Character character : gameWorld.allCharacters) {
                                if (character.getName().equalsIgnoreCase(characterInput)) {
                                    recievingCharacterFound = true;
                                    recievingCharacter = character;
                                }
                            }
                            if (recievingCharacterFound) {
                                gameWorld.tradeItems(givingCharacter,recievingCharacter,itemToTrade);
                            } else {
                                System.out.println("Recieving character not found!");
                            }
                        } else {
                            System.out.println("Giving character not found!");
                        }
                    } else {
                        System.out.println("Item does not exist!");
                    }
                    break; //endregion
                case 7:
                    menuIsOn = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter a valid input!");
                    break;
            }
        }
    }
}
