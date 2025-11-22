import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        Elevator elevatorMain = new Elevator(1);
        int _min_ = 1;
        int _max_ = 5;
        String floor;
        int intFloor;
        ElevatorController controller  = new ElevatorController(elevatorMain,_min_,_max_);
        while (true){
            System.out.println("Request floor: ");
            floor = userInput.nextLine().trim();
            if (floor.equalsIgnoreCase("quit")){
                break;
            }
            try{
                intFloor = Integer.parseInt(floor);
                // yay
                controller.goToFloor(intFloor);
            }
            catch(Exception e){
                System.out.println("no bro you cant go to floor " + floor);
            }
        }
        userInput.close();
        
    }
}