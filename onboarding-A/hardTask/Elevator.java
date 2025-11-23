public class Elevator {
    private int CurrentFloor;
    public Elevator(int CurrentFloor) {
        this.CurrentFloor = CurrentFloor;
        System.out.println("Elevator instantiated at floor "+CurrentFloor);
    }
    public void moveUp() {
        CurrentFloor++;
    }
    public void moveDown() {
        CurrentFloor--;
    }
    public int getCurrentFloor() {
        return CurrentFloor;
    }

}
