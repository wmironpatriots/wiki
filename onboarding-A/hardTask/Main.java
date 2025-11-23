package exerciseThreeElevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Main - The entry point, Sets up and runs the program loop

		Elevator elevator = new Elevator(1);
		
		System.out.println("Elevator instantiated at floor " + elevator.getCurrentFloor() + "\n");
		
		ElevatorController controller = new ElevatorController(elevator, 1, 5);
		//Console console = System.console();
		
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			String line;
		try
		{
			
			do
			{
				System.out.printf("Enter floor # or exit: \n");
				line = reader.readLine();
				
				if (line.equalsIgnoreCase("exit") == false)
				{
				
					try
					{
						int requestFloor = Integer.parseUnsignedInt(line);
						controller.goToFloor(requestFloor);
					}
					catch(NumberFormatException nfe)
					{
						System.out.printf("Floor input must be a non-negative integer.\n");
					}
				}
				
			} while(line.equalsIgnoreCase("exit") == false);
		}
		catch(IOException ioException)
		{
			System.out.printf(ioException.getMessage());
		}
		
		System.out.printf("Exiting.\n");
	}

}
