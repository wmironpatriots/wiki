import java.util.Scanner;

class Elevator_hard_task{
    public static void main(String[] args){
        Elevator elevator = new Elevator(1);
        ElevatorController controller = new ElevatorController(elevator, 1, 5);

        System.out.println("Elevator instantiated at floor 1");

        while (true){
            controller.goToFloor(controller.requestFloor());
        }
    }
}

class Elevator{   
    private final int initialFloor;
    private int movedFloor = 0;
    Elevator(int initialFloor){
        this.initialFloor = initialFloor;
    }
    public int getCurrentFloor(){
        return initialFloor + movedFloor;
    }

    public void moveUp(){
        movedFloor += 1;
    }

     public void moveDown(){
        movedFloor -= 1;
    }
    
}
class ElevatorController{
    private final Elevator instance;
    private final int minFloor;
    private final int maxFloor;
    private boolean moved;
    private int request;
    ElevatorController(Elevator instance, int minFloor, int maxFloor){
        this.instance = instance;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int requestFloor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Request floor: ");
        String input = String.valueOf(scanner.nextLine());
        if (String.valueOf(input).equals("quit")){
            System.exit(0);
        } else{
            request = Integer.parseInt(input);
        }
        return request;
    }

    public void goToFloor(int nextFloor){
        int currentFloor = instance.getCurrentFloor();
        if (minFloor<= nextFloor && nextFloor <= maxFloor){
            moved = false;
            if (currentFloor > nextFloor){
                int distance = currentFloor - nextFloor;
                for (int i = 0; i < distance; i ++){
                    instance.moveDown();
                    System.out.println("Moving down... now at floor " + instance.getCurrentFloor());
                }
                moved = true;
            } else if (currentFloor < nextFloor){
                int distance = nextFloor - currentFloor;
                for (int i = 0; i < distance; i ++){
                    instance.moveUp();
                    System.out.println("Moving up... now at floor " + instance.getCurrentFloor());
                }
                moved = true;
            } else if (currentFloor == nextFloor){
                System.out.println("You are already at floor " + instance.getCurrentFloor());
                moved = false;
            }
        } else {
            System.out.println("Floor " + nextFloor + " is not a valid floor");
        }
        if (moved == true){
            System.out.println("Arrived at floor " + instance.getCurrentFloor());
            moved = false;
        }
    }
}