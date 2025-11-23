import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        ElevatorController controller = new ElevatorController(elevator, 1, 5);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Request floor: ");
            if (in.hasNextInt()) {
                int floor = in.nextInt();
                controller.goToFloor(floor);
            }
            else {
                System.out.println("Exiting.");
                in.close();
                break;
            }
        }
    }

}