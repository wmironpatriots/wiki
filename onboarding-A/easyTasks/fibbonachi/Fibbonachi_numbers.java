package fibbonachi;

public class Fibbonachi_numbers {
	public long first_number = 0;
	public long second_number = 1;

	public void calculate() {
		long sum = first_number + second_number;
		System.out.println(sum);
		first_number = second_number;
		second_number = sum;
		
	}
	
	}

