import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        ElevatorController controller = new ElevatorController(elevator, 1, 5);

        System.out.println("Elevator instantiated at floor 1");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Request floor: ");
            String line = sc.nextLine().trim();

            if (line.equalsIgnoreCase("quit")) {
                break;
            }

            if (line.matches("\\d+")) {
                int target = Integer.parseInt(line);
                controller.requestFloor(target);
            }
            

            System.out.println(); 
        }

        sc.close();
    }
}