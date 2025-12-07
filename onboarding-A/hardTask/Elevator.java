package helloworld;

public class Elevator {
	
	private int currentFloor;
	public Elevator(int currentFloor) {
		this.currentFloor = currentFloor;
		System.out.println("Elevator instantiated at floor " + currentFloor);
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public void moveUp() {
		currentFloor++;
		System.out.println("Moving up... now at floor " + currentFloor);
	}
	
	public void moveDown() {
		currentFloor--;
		System.out.println("Moving down... now at floor " + currentFloor);
	}



}
