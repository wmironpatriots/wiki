package fibbonachi;

public class Main {
	
	public static void main(String[] args) {
	
		
		Fibbonachi_numbers fn = new Fibbonachi_numbers();
		System.out.println(fn.first_number);
		System.out.println(fn.second_number);
		for (int i = 1; i < 64; i++)
		{
			fn.calculate();
	
		}
	}

}
