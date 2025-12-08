public class Elevator {
    int floor;
    public Elevator(int startFloor) {
        floor = startFloor;
    }
    void moveUp() {
        floor++;
    }
    void moveDown() {
        floor--;
    }
    int getCurrentFloor() {
        return floor;
    }
}