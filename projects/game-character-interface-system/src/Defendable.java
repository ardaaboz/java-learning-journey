public interface Defendable {
    void defend();
    default int getDefense() {
        int defense = 10;
        return defense;
    }
}
