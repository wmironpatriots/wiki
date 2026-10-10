public class Elevator{

    private int floor;

     Elevator(int start){
        this.floor = start;
        System.out.println("Elevator instantiated at floor " + String.valueOf(start)); 
    }
    public void moveUp(){
        this.floor = floor + 1;
    }
    public void moveDown(){
        this.floor = floor - 1;
    }
    public int getCurrentFloor(){
        return(this.floor);
    }

    

}