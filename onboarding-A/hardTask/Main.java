
import java.util.Scanner;

public class Main {

    // Main class: entry point for the elevator simulation
    public static void main(String[] args) {
        // Create an Elevator object starting at floor 1
        Elevator elevator = new Elevator(1);
        // Create an ElevatorController with min floor 1 and max floor 5
        ElevatorController controller = new ElevatorController(elevator, 1, 5);

        // Print the initial state of the elevator to inform the user
        System.out.println("Elevator instantiated at floor " + elevator.getCurrentFloor());

        // Use a Scanner to read user input from the console
        // The try-with-resources statement ensures the scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            // Continuously prompt the user for floor requests until they decide to quit
            while (true) {
                System.out.print("Request floor: ");
                String line = scanner.nextLine().trim();

                // If the user types 'quit' (case-insensitive), exit the loop and end the program
                if (line.equalsIgnoreCase("quit")) {
                    break;
                }

                try {
                    // Attempt to convert the user input to an integer floor number
                    int target = Integer.parseInt(line);
                    // Command the elevator controller to move the elevator to the requested floor
                    controller.goToFloor(target);
                } catch (NumberFormatException e) {
                    // If the input is not a valid integer, notify the user
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
