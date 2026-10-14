import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        System.out.println("Elevator instantiated at floor 1");
        ElevatorController controller = new ElevatorController(elevator, 1, 5);
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println();
            System.out.print("Request floor: ");
            String input = scanner.nextLine().trim();


            if (input.equalsIgnoreCase("quit")) {
                break;
            }


            try{
                int targetFloor = Integer.parseInt(input);
                controller.goToFloor(targetFloor);
            } catch (NumberFormatException e) {
                System.out.println("Floor " + input + " is not a valid floor");
            }
        }
        scanner.close();
    }
}
