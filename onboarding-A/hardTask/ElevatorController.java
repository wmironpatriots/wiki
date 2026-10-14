public class ElevatorController {
    private Elevator elevator;
    private int minFloor;
    private int maxFloor;


    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
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


        if (targetFloor > current) {
            while (elevator.getCurrentFloor() < targetFloor){
                elevator.moveUp();
                System.out.println("Moving up... now at floor " + elevator.getCurrentFloor());
            }
            System.out.println("Arrived at floor " + targetFloor);
        }
        else if (targetFloor < current) {
            while (elevator.getCurrentFloor() > targetFloor) {
                elevator.moveDown();
                System.out.println("Moving down... now at floor " + elevator.getCurrentFloor());
            }
            System.out.println("Arrived at floor " + targetFloor);
        }
        else {
       
        }
    }
}
