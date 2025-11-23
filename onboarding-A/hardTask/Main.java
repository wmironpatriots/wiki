import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Elevator elevator = new elevator(1);
    ElevatorController elControl = new ElevatorController(elevator, 1, 5);
    while(true){
      System.out.print("Request floor: ");
      String ans = input.nextLine();

      if(ans.equalsIgnoreCase("quit")){
        break;
      }

      elControl.requestFloor(Integer.parseInt(ans));
      
    }
  }
}
