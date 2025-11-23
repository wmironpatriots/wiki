import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        ElevatorController controller = new ElevatorController(elevator, 1, 5);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Request floor: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                int floor = Integer.parseInt(input);
                controller.goToFloor(floor);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        scanner.close();
    }
}