
public class Elevator {

    // Variable to store the current floor of the elevator
    private int currentFloor;

    // Constructor to initialize the elevator at a specific floor
    public Elevator(int initialFloor) {
        this.currentFloor = initialFloor;
        System.out.println("Elevator instantiated at floor " + initialFloor);
    }

    // Method to move the elevator up by one floor
    public void moveUp() {
        currentFloor += 1;
    }

    // Method to move the elevator down by one floor
    public void moveDown() {
        currentFloor -= 1;
    }

    // Method to get the current floor of the elevator
    public int getCurrentFloor() {
        return currentFloor;
    }

    // Method to set the current floor of the elevator
    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }
}
