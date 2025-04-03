public class Warrior extends GameCharacter implements Attackable, Defendable, Movable{
    @Override
    public void attack() {
        System.out.println("\nWarrior attacks with sword!");
    }

    @Override
    public int getDamage() {
        int damage = 20;
        return damage;
    }

    @Override
    public void defend() {
        System.out.println("Warrior defends with shield!");
    }

    @Override
    public int getDefense() {
        int defense = 10;
        return defense;
    }

    @Override
    public void move(String direction) {
        System.out.println("Warrior is moving towards " + direction);
    }

    @Override
    public int getSpeed() {
        int speed = 10;
        return speed;
    }

    @Override
    void displayStats() {
        System.out.println("\nWarrior stats");
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Level: " + getLevel());
        System.out.println("Damage: " + getDamage());
        System.out.println("Defense: " + getDefense());
        System.out.println("Speed: " + getSpeed());
    }
}
