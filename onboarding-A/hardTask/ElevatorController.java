package exerciseThreeElevator;

public class ElevatorController {

	private Elevator elevator;
	private int minimumFloor;
	private int maximumFloor;


	/*Given a target floor, tells the elevator how to move
Handles printing elevator status to terminal- the output format shown below is required
Prevents elevator from going to an invalid floor
Constructor must take three parameters: the Elevator instance, the minimum floor, and the maximum floor (in that order!). */
	
	
	
	public ElevatorController(Elevator elevator, int minimumFloor, int maximumFloor) 
	{
		this.elevator = elevator;
		this.minimumFloor = minimumFloor;
		this.maximumFloor = maximumFloor;
		
		System.out.println("Elevator instantiated at floor " + elevator.getCurrentFloor() + "\n");
		
	}
	

	public void goToFloor(int floorYoureGoingTo)
	{
		
		if (floorYoureGoingTo > maximumFloor || floorYoureGoingTo < minimumFloor)
		{
			System.out.println("Floor " + floorYoureGoingTo + " is not a valid floor" );
			return;
		}
		//System.out.println("Request Floor: " + floorYoureGoingTo);
		
		int currentFloor = elevator.getCurrentFloor();
		
		if (currentFloor - floorYoureGoingTo < 0)
	//going up
		{
			for (int i = currentFloor; i < floorYoureGoingTo; i++)
			{
			elevator.moveUp();
			System.out.println("Moving up... now at floor " + elevator.getCurrentFloor());
			}
		}
		if (currentFloor - floorYoureGoingTo > 0)
	//going down
		{
			for (int i = currentFloor; i > floorYoureGoingTo; i--)
			{
				elevator.moveDown();
				System.out.println("Moving down... now at floor " + elevator.getCurrentFloor());
			}
			
			
		
		}
		
		System.out.println("Arrived at floor " + elevator.getCurrentFloor());
	}
}
