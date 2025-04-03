public interface Healable {
    void heal();
    default int getHealingPower() {
        int healingPower = 10;
        return healingPower;
    }
}
