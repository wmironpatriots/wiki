public class ElevatorController {
    int minFloor, maxFloor;
    Elevator targetElevator;
    
    public ElevatorController(Elevator elevator, int min, int max) {
        minFloor = min;
        maxFloor = max;
        targetElevator = elevator;
        
        System.out.print("Elevator instantiated at floor ");
        System.out.println(elevator.getCurrentFloor());
        
        System.out.println();
    }
    
    void goToFloor(int target) {
        while (target != targetElevator.getCurrentFloor()) {
            if ((target > maxFloor) || (target < minFloor)) {
                System.out.print("Floor ");
                System.out.print(target);
                System.out.println(" is not a valid floor");
                break;
            } else {
                if (targetElevator.getCurrentFloor() - target < 0) {
                    targetElevator.moveUp();
                    System.out.print("Moving up... ");
                } else if (targetElevator.getCurrentFloor() - target > 0) {
                    targetElevator.moveDown();
                    System.out.print("Moving down... ");
                }
                System.out.print("now at floor ");
                System.out.println(targetElevator.getCurrentFloor());
            }
        };
        if (target == targetElevator.getCurrentFloor()) {
            System.out.print("Arrived at floor ");
            System.out.println(target);
        }
    }
}