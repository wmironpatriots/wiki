//package onboarding-A.hardTask;


public class Elevator {
    private int currentFloor;
    
    public Elevator(int n){
        currentFloor = n;
    }
    public void moveUp(){
        currentFloor++;
    }
    public void moveDown(){
        currentFloor--;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
}
