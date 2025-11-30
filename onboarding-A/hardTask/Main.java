import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        final int MIN_FLOOR = 1;
        final int MAX_FLOOR = 5;
        final int INITIAL_FLOOR = 1;

        Elevator elevator = new Elevator(INITIAL_FLOOR);
        ElevatorController controller = new ElevatorController(elevator, MIN_FLOOR, MAX_FLOOR);
        
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean running = true;

        // Main program loop
        while (running) {
            System.out.print("\nRequest floor: ");
            input = scanner.next();

            if (input.equalsIgnoreCase("quit")) {
                running = false;
                break;
            }

            try {
                int targetFloor = Integer.parseInt(input);
                controller.callElevator(targetFloor);
            } catch (NumberFormatException e) {

                System.out.println("Invalid input. numbers only lil bro");
            }
        }

        scanner.close();
        System.out.println("Elevator system shut down.");
    }
}