import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args){
        ArrayList<Long> fibonacci = new ArrayList<>(List.of(0L, 1L));
        for (int i = 2; i < 64; i++) {
            Long previous = fibonacci.get(i-1);
            Long lastprevious = fibonacci.get(i-2);
            fibonacci.add(previous + lastprevious);
        }
        for (Long num : fibonacci){
            System.out.println(num);
        }
    }
}
