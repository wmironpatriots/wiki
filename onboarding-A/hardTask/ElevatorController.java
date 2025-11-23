public class ElevatorController {
    private Elevator elevator;
    private int minFloor;
    private int maxFloor;
    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
        this.elevator = elevator;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public void goToFloor(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Floor " + floor + " is not a valid floor");
            return;
        }
        while (this.elevator.getCurrentFloor() != floor){
            if (this.elevator.getCurrentFloor() < floor){
                this.elevator.moveUp();
                System.out.println("Moving up... now at floor " + this.elevator.getCurrentFloor());
            }
            else {
                this.elevator.moveDown();
                System.out.println("Moving down... now at floor " + this.elevator.getCurrentFloor());
            }
        }
        System.out.println("Arrived at floor " + floor);
    }
}
