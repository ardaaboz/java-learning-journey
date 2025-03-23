public class Item {

    // Creating encapsulated fields
    private String name;
    private String type;
    private String rarity;
    private double value;
    private double weight;

    // Constructor
    Item(String name, String type, String rarity, double value, double weight) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.value = value;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getRarity() {
        return rarity;
    }
    public double getValue() {
        return value;
    }
    public double getWeight() {
        return weight;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Display method
    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Rarity: " + getRarity());
        System.out.println("Value: " + getValue());
        System.out.println("Weight: " + getWeight());
    }


}
