import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1);
        ElevatorController controller =
        new ElevatorController(elevator, 1, 5);
        
        Scanner scanner = new Scanner(System.in);
        controller.run(scanner);
        scanner.close();
    }
}