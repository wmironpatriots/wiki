import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        final int min = 1;
        final int max = 5;
        final int inital = 1;

        Elevator elevator = new Elevator(inital);
        ElevatorController controller = new ElevatorController(elevator, min, max);
        
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("\nRequest floor: ");
            input = scanner.next();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                int targetFloor = Integer.parseInt(input);
                controller.goToFloor(targetFloor);
            } catch (NumberFormatException e) {

                System.out.println("only integers.");
            }
        }

        scanner.close();
    }
}