public class Elevator{
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