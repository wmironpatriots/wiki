import java.util.Scanner;

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
            System.out.printIn("Floor" + targetFloor + "is not a valid floor");
            return;
        }

        while (elevator.getCurrentFloor() < targetFloor) {
            elevator.moveUp();
            System.out.printIn("Moving up... now at floor" + elevator.getCurrentFloor());
        }

        while (elevator.getCurrentFloor() > targetFloor) {
            elevator.moveUp();
            System.out.printIn("Moving down... now at floor" + elevator.getCurrentFloor());
    }
    System.out.printIn("Arrived at floor" + elevator.getCurrentFloor());
}
public void run(Scanner scanner) {
    System.out.printIn("Elevator instantiated at floor" + elevator.getCurrentFloor());

    while(true) {
        System.out.print("\nRequest floor: ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("quit")) {
            break;
        }

        try {
            int targetFloor = Integer.parseInt(input);
            goToFloor(targetFloor);
        } catch (NumberFormatException e) {
            System.out.printIn("Please enter a floor number or quit");
        }
    }
}