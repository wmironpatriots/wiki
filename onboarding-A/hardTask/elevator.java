import java.util.Scanner;
class Elevator{
    int currentFloor = 1;
    public Elevator(int initalFloor){
        this.currentFloor = initalFloor;
    }
    public void moveUp(){
        currentFloor += 1;
        System.out.print("Moving up... " + "now at floor " + currentFloor+ "\n");
    }
    public void moveDown(){
        currentFloor -= 1;
        System.out.print("Moving down... " + "now at floor " + currentFloor+ "\n");
    }
    public int getCurrentFloor(){
        return(currentFloor);
    }
}
class ElevatorController{
    Elevator instance;
    int min;
    int max;
    int target;
    int _floor_;
    public ElevatorController(Elevator _instance_,int minimumFloor,int maximumFloor){
        System.out.print("Elevator instantiated at floor " + String.valueOf(minimumFloor) + "\n");
        this.instance = _instance_;
        this.min = minimumFloor;
        this.max = maximumFloor;
    }
    public void goToFloor(int floorTarget){
        if (floorTarget>max||floorTarget<min){
            System.out.println("Floor " + String.valueOf(floorTarget) + " is not a valid floor");
            return;
        }
        this.target = floorTarget;
        // was told here _floor_ isnt exactly needed but dont fix whats not broken 
        _floor_ = instance.getCurrentFloor();
        for (int i = 0;i<Math.abs(target-_floor_);i++){
            if (target > _floor_ ){
                instance.moveUp();
            }
            else {
                instance.moveDown();
            }
        }
        System.out.println("Arrived at floor "+ instance.getCurrentFloor());
    } 
}
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