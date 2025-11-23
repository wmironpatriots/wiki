public class Elevator {
  public int currentFloor;
  public Elevator(int firstFloor) {
    currentFloor  = firstFloor;
  }
 
  public void moveUp(int moveValue) {
    for (int i = 0; i < moveValue; i++) {
      currentFloor += 1;
      System.out.println("Moving Up... now at floor " + currentFloor);
     
    }
    System.out.println("Arrived at floor " + getCurrentFloor());
    System.out.println(" ");
  }
 
  public void moveDown(int moveValue) {
    for (int i = 0; i < moveValue; i++) {
      currentFloor -= 1;
      System.out.println("Moving down... now at floor " + currentFloor);
     
    }
    System.out.println("Arrived at floor " + getCurrentFloor());
  }
 
  public int getCurrentFloor() {
    return currentFloor;
  }
}