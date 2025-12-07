package helloworld;

public class ElevatorController 
{
	private int minFloor;
	private int maxFloor;
	private Elevator elevator;
	public void goToFloor(int requestedFloor) 
	{
		if (requestedFloor > maxFloor || requestedFloor < minFloor)
		{
			System.out.println("Floor " + requestedFloor + " is not a valid floor");
			return;
		}
		
		if (requestedFloor > elevator.getCurrentFloor()) 
		{
			while (requestedFloor != elevator.getCurrentFloor())
			{
				elevator.moveUp();
			}
		}
		else
		{
			while (requestedFloor != elevator.getCurrentFloor())
			{
				elevator.moveDown(); 
			}
		
		}
		System.out.println("Arrived at floor " + requestedFloor);
		
	}

	
	public ElevatorController(Elevator elevator, int minFloor, int maxFloor)
	{
		this.minFloor = minFloor;
		this.maxFloor = maxFloor;
		this.elevator = elevator;

	}
	

}
