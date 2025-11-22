public class ElevatorController{
    Elevator instance;
    int min;
    int max;
    int target;
    int _floor_;
    public ElevatorController(Elevator _instance_,int minimumFloor,int maximumFloor){
        System.out.print("Elevator instantiated at floor " + String.valueOf(minimumFloor) + "\n");
        this.instance = _instance_;
        this.min = minimumFloor;
        this.max = maximumFloor;
    }
    public void goToFloor(int floorTarget){
        if (floorTarget>max||floorTarget<min){
            System.out.println("Floor " + String.valueOf(floorTarget) + " is not a valid floor");
            return;
        }
        this.target = floorTarget;
        // was told here _floor_ isnt exactly needed but dont fix whats not broken 
        _floor_ = instance.getCurrentFloor();
        for (int i = 0;i<Math.abs(target-_floor_);i++){
            if (target > _floor_ ){
                instance.moveUp();
            }
            else {
                instance.moveDown();
            }
        }
        System.out.println("Arrived at floor "+ instance.getCurrentFloor());
    } 
}