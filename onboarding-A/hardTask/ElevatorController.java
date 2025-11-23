public class ElevatorContoller{
  private final int minFloor;
  private final int maxFloor;
  private final Elevator elevator;
  
  public ElevatorController(Elevator elevator, int minFloor, int maxFloor){
    this.elevator = elevator;
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public void goToFloor(int floor){
    System.out.println("Request Floor " + floor);
    if(floor > maxFloor || floor < minFloor){
      System.out.println("Floor " + floor + " is not a valid floor.");
      return;
    }
    int currentFloor = elevator.getCurrentFloor();

    if(currentFloor > floor){
      while(currentFloor!=floor){
        elevator.moveDown();
        currentFloor--;
        System.out.println("Moving down... now at floor " + currentFloor);
      }
      System.out.println("Arrived at floor " + currentFloor);
    }

    if(currentFloor < floor){
      while(currentFloor!=floor){
        elevator.moveUp();
        currentFloor++;
        System.out.println("Moving up... now at floor " + currentFloor);
      }
      System.out.println("Arrived at floor " + currentFloor);
    }
    
    System.out.println();
  }
}
