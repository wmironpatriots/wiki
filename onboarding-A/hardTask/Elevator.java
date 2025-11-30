public class Elevator {
    private int currentFloor;

    public Elevator(int initialFloor) {
        this.currentFloor = initialFloor;
        System.out.println("Elevator at floor " + initialFloor);
    }

    public void moveUp() {
        this.currentFloor++;
    }

    public void moveDown() {
        this.currentFloor--;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }
}