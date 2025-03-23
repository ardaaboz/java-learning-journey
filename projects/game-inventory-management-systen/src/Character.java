import java.util.ArrayList;

public class Character {

    // Creating encapsulated fields
    private String name;
    private int level;
    private double maximumCarryingCapacity;
    public ArrayList<Item> itemArrayList;
    public ArrayList<Item> equippedItems;


    // Constructor
    Character(String name, int level, double maximumCarryingCapacity) {
        this.name = name;
        this.level = level;
        this.itemArrayList = new ArrayList<>();
        this.equippedItems = new ArrayList<>();
        this.maximumCarryingCapacity = maximumCarryingCapacity;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public double getMaximumCarryingCapacity() {
        return maximumCarryingCapacity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setMaximumCarryingCapacity(double maximumCarryingCapacity) {
        this.maximumCarryingCapacity = maximumCarryingCapacity;
    }

    // Method to add items to inventory
    public void addItem(Item itemToAddToInventory) {
        itemArrayList.add(itemToAddToInventory);
    }

    // Method to remove items from the inventory
    public void removeItem(Item itemToRemoveFromInventory) {
        itemArrayList.remove(itemToRemoveFromInventory);
    }

    // Calculate total inventory weight
    public double calculateTotalInventoryWeight() {
        double totalInventoryWeight = 0;
        for (Item item : itemArrayList) {
            totalInventoryWeight += item.getWeight();
        }
        return totalInventoryWeight;
    }

    // Display information
    public void displayInformation() {
        System.out.println("\n-----Character information-----");
        System.out.println("Name: " + getName());
        System.out.println("Level: " + getLevel());
        System.out.println("Max Carrying Capacity: " + getMaximumCarryingCapacity());
        System.out.println("Inventory contents: ");
        for (Item item : itemArrayList) {
            item.displayInformation();
        }
        System.out.println("----------");
    }

    // Method to equip item
    public void equipItem(Item itemToEquip) {
        for (Item item : itemArrayList) {
            if (item.equals(itemToEquip)) {
                equippedItems.add(itemToEquip);
            }
        }
    }
}
