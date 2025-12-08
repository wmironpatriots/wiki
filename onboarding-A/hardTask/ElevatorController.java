
public class ElevatorController {

    // Elevator instance to control
    private final Elevator elevator;
    // Minimum allowed floor
    private final int minFloor;
    // Maximum allowed floor
    private final int maxFloor;

    // Constructor to initialize the ElevatorController with an elevator and floor range
    // Ensures the elevator's initial floor is within the allowed range by setting it to minFloor if out of range
    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
        this.elevator = elevator;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;

        int initialFloor = elevator.getCurrentFloor();
        if (initialFloor < minFloor || initialFloor > maxFloor) {
            elevator.setCurrentFloor(minFloor);
        }
    }

    // Method to move the elevator to the specified target floor
    public void goToFloor(int targetFloor) {
        // Validate if the target floor is within the allowed range
        if (targetFloor < minFloor || targetFloor > maxFloor) {
            System.out.println("Floor " + targetFloor + " is not a valid floor");
            return;
        }

        // Move the elevator up until it reaches the target floor
        while (elevator.getCurrentFloor() < targetFloor) {
            elevator.moveUp();
            System.out.println("Moving up... now at floor " + elevator.getCurrentFloor());
        }

        // Move the elevator down until it reaches the target floor
        while (elevator.getCurrentFloor() > targetFloor) {
            elevator.moveDown();
            System.out.println("Moving down... now at floor " + elevator.getCurrentFloor());
        }

        // Announce arrival at the target floor
        System.out.println("Arrived at floor " + elevator.getCurrentFloor());
    }
}
