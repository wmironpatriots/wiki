public class ElevatorController {
    private final Elevator elevator;
    private final int minFloor;
    private final int maxFloor;


    public ElevatorController(Elevator elevator, int minFloor, int maxFloor) {
        this.elevator = elevator;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }


    public void callElevator(int targetFloor) {
        if (targetFloor < minFloor || targetFloor > maxFloor) {
            System.out.println("Floor " + targetFloor + " is a alternate world, probably the dark world");
            return;
        }

        int currentFloor = elevator.getCurrentFloor();

        if (currentFloor == targetFloor) {
            System.out.println("Arrived at floor " + targetFloor);
            return;
        }

        while (currentFloor != targetFloor) {
            if (targetFloor > currentFloor) {
                
                elevator.moveUp();
                currentFloor = elevator.getCurrentFloor();
                System.out.println("Moving up... now at floor " + currentFloor);
            } else {
                
                elevator.moveDown();
                currentFloor = elevator.getCurrentFloor();
                System.out.println("Moving down... now at floor " + currentFloor);
            }
        }
        

        System.out.println("Arrived at floor " + targetFloor);
    }
}