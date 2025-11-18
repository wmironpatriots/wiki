public class Elevator {
    private int currentFloor;

    public Elevator(int initialFloor) {
        this.currentFloor = initialFloor;
        System.out.println("Elevator instantiated at floor " + initialFloor);
    }

    public void moveUp() {
        currentFloor++;
    }

    public void moveDown() {
        currentFloor--;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}