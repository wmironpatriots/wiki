package exerciseThreeElevator;

public class Elevator {

/*Only tracks current floor
	Can only move one floor at a time (no skipping floors)
	Recommended Methods: moveUp(), moveDown(), getCurrentFloor().
	Constructor must take only one parameter: the initial floor. */
	
	private int currentFloor;
	
	public Elevator(int currentFloor)
	{
		this.currentFloor = currentFloor;
	}
	
	public int getCurrentFloor()
	{
		return currentFloor;
	}
	
	public void moveUp()
	{
	currentFloor++;
	}
	public void moveDown()
	{
	currentFloor--;
	}
}


