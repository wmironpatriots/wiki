public class ElevatorController{
    private Elevator elevator;
    private int min;
    private int max;

    public ElevatorController(Elevator elevatorS, int minium, int maxiumum){
        this.elevator = elevatorS;
        this.min = minium;
        this.max = maxiumum;
        
    }
    
    public void goToFloor(int target){
        if (target < min | target > max){
            System.out.println("Floor " + String.valueOf(target) + " is not a valid floor"); 
            return;
        }
        while(target < elevator.getCurrentFloor()){
            elevator.moveDown();
            System.out.println("Moving down... now at floor " + String.valueOf(elevator.getCurrentFloor())); 
        }
        while(target > elevator.getCurrentFloor()){
            elevator.moveUp();
            System.out.println("Moving up... now at floor " + String.valueOf(elevator.getCurrentFloor())); 
        }
        System.out.println("Arrived at floor " + String.valueOf(elevator.getCurrentFloor())); 
    }

}