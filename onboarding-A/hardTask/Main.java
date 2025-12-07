package helloworld;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Elevator elevator = new Elevator(1);
		ElevatorController controller = new ElevatorController(elevator, 1, 5);
		String userinput;
		
		do
		{
			Scanner scanner = new Scanner(System.in);
		    System.out.print("Request floor: ");
		    
		    userinput = scanner.nextLine(); 
		    try 
		    {
		    	int floor = Integer.parseInt(userinput);
		    	controller.goToFloor(floor);
		    }
		    catch(NumberFormatException nfe)
		    {
		    	if (userinput.equals("quit") == false)
		    	{
		    		System.out.println("invalid input");
		    	}
		    }
		} while (userinput.equals("quit") == false);

		
		
	}

}
