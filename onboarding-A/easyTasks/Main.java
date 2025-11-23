package roboticshw;

//import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sequence();
	}
	
	
	public static void sequence()
	{
		

		
		// To Do: use BigInteger class.
		// BigInteger
		long [] array=new long[100];
		array[0]=0;
		array[1]=1;
		for(int i=0; i < (array.length - 2) ; i++) {
			array[i+2] = array[i] + array[i+1];
		}
		
		for(long value : array) {
		{
			System.out.println(value + ",");
		}
		
		}
	}
} //end Main
