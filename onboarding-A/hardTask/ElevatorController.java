//package onboarding-A.hardTask;

public class ElevatorController {
    private Elevator elev;
    private int bottom;
    private int top;

    public ElevatorController(Elevator elev, int bottom,int top){
            this.elev = elev;
            this.bottom = bottom;
            this.top = top;
            System.out.println("Elevator instantiated at floor " + elev.getCurrentFloor());
    }
    public void goToFloor(int n){
        System.out.println("Request floor: " + n);
        if(n > top || n < bottom){
            System.out.println("Floor " + n +  " is not a valid floor");
        }
        else{
            while(n > elev.getCurrentFloor()){
                elev.moveUp()
                System.out.println("Moving up... now at floor " + elev.getCurrentFloor());
            }
            while(n < elev.getCurrentFloor()){
                elev.moveDown()
                System.out.println("Moving down... now at floor " + elev.getCurrentFloor());
            }
            System.out.println("Arrived at floor " + elev.getCurrentFloor());
        }
    }
}
