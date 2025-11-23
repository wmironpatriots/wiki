public class ElevatorController {
    private int minLevel;
    private int maxLevel;
    private Elevator elevator;
    // current level, minimum level and maximum level
    public ElevatorController(Elevator elevator, int minLevel, int maxLevel) {
      //initializer, dont put functions here
      this.minLevel = minLevel;
      this.maxLevel = maxLevel;
      this.elevator = elevator;  
      }
    //put functions here
    public void moveLevel(int level) {
      System.out.println("Request floor: " + level);
     
      // checks if level is within the min and max
      if (level >= minLevel && level <= maxLevel){
        // checks if the requested level is greater than the current level
       
        if (level > elevator.getCurrentFloor()) {
          int moveValue = level - elevator.getCurrentFloor();
          elevator.moveUp(moveValue);
        }
        // if requested floor is lower than the current floor
        else {
          int moveValue = elevator.getCurrentFloor() - level;
          elevator.moveDown(moveValue);
        }
      }
       
      else {
        System.out.println("Floor " + level + " is not a valid level");
        System.out.println(" ");
      }
    }
   
   
   
}
