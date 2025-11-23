public class Elevator{
  private int currentFloor;

  public Elevator(int currentFloor){
    this.currentFloor = currentFloor;
    System.out.println("Elevator instantiated at floor " + currentFloor);
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
