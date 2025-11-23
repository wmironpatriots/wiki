public class Main {
    public static void main(String[] args) {
      Elevator elevator = new Elevator(1);
      ElevatorController controller = new ElevatorController(elevator,1,5);
      System.out.println("Elevator instantiated at floor " + elevator.getCurrentFloor());
      
      
      controller.moveLevel(3);
      controller.moveLevel(8);
      controller.moveLevel(1);
  }
}