public interface Movable {
    void move(String direction);
    default int getSpeed(){
        int speed = 10;
        return speed;
    }
}
