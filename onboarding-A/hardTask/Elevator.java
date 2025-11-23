public class Elevator {
    private int currentFloor;

    public Elevator(int initialFloor) {
        currentFloor = initialFloor;
        System.out.println("Elevator instantiated at floor " + initialFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        currentFloor++;
        System.out.println("Moving up... now at floor " + currentFloor);
    }

    public void moveDown() {
        currentFloor--;
        System.out.println("Moving down... now at floor " + currentFloor);
    }
}