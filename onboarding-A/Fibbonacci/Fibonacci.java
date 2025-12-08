import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Fibonacci
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        
        int numCount = 64;
        
        ArrayList<Long> numbers = new ArrayList<Long>();
        numbers.add(0L);
        numbers.add(1L);
        
        long num1 = 0;
        long num2 = 1;
        long Fn = 0;
        
        for (int i = 0; i < numCount; i++) {
            if (i > 0) {
                num1 = numbers.get(i - 1);
                num2 = numbers.get(i);
                Fn = num1 + num2;
                numbers.add(Fn);
                
                System.out.println(Fn);
            }
        }
        long stop = System.nanoTime();
        float time = (stop - start) / 1000000F;
        
        System.out.println();
        
        System.out.print("Calculated in ");
        System.out.print(time);
        System.out.print(" millisecconds.");
        
    }
}
