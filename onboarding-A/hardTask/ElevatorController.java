public class ElevatorController {
    private Elevator elevator;
    private int minFloor;
    private int maxFloor;

    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
        System.out.println("Elevator instantiated at floor 1\n");
        this.elevator = elevator;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void goToFloor(int targetFloor) {
        if (targetFloor < minFloor || targetFloor > maxFloor) {
            System.out.println("Floor " + targetFloor + " is not a valid floor");
            return;
        }

        int current = elevator.getCurrentFloor();

        if (targetFloor == current) {
            System.out.println("Already at floor " + current);
            return;
        }

        while (current < targetFloor) {
            elevator.moveUp();
            current = elevator.getCurrentFloor();
            System.out.println("Moving up... now at floor " + current);
        }

        while (current > targetFloor) {
            elevator.moveDown();
            current = elevator.getCurrentFloor();
            System.out.println("Moving down... now at floor " + current);
        }

        System.out.println("Arrived at floor " + targetFloor);
    }
}
