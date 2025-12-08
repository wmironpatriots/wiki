import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Elevator elevator = new Elevator(1);
        ElevatorController controller = new ElevatorController(elevator, 1, 5);
        
        int targetFloor = controller.minFloor;
        String otherInput;
        
        while (true) {
            System.out.print("Request floor: ");
            try {
                targetFloor = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                break;
            }
            
            controller.goToFloor(targetFloor);
            System.out.println();
        }
        
        
    }
}