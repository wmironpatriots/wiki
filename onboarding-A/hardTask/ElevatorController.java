public class ElevatorController {
    private final Elevator elevator;
    private final int minFloor;
    private final int maxFloor;

    public ElevatorController(Elevator elevator, int min, int max) {
        this.elevator = elevator;
        this.minFloor = min;
        this.maxFloor = max;
    }

    public boolean isValidFloor(int floor) {
        return floor >= minFloor && floor <= maxFloor;
    }

    public void requestFloor(int target) {
        if (!isValidFloor(target)) {
            System.out.println("Floor " + target + " is not a valid floor");
            return;
        }

        int curr = elevator.getCurrentFloor();

        while (curr < target) {
            elevator.moveUp();
            curr = elevator.getCurrentFloor();
            System.out.println("Moving up... now at floor " + curr);
        }

        while (curr > target) {
            elevator.moveDown();
            curr = elevator.getCurrentFloor();
            System.out.println("Moving down... now at floor " + curr);
        }

        System.out.println("Arrived at floor " + target);
    }
}