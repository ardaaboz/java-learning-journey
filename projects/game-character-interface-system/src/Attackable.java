public interface Attackable {
    void attack();
    default int getDamage() {
        int damage = 10;
        return damage;
    }
}
