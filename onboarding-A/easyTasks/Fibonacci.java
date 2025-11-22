import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args){
        ArrayList<Integer> fibonacci = new ArrayList<>(List.of(0, 1));
        for (int i = 2; i < 100; i++) {
            int previous = fibonacci.get(i-1);
            int lastprevious = fibonacci.get(i-2);
            fibonacci.add(previous+ lastprevious);
        }
        System.out.println(fibonacci);
    }
}
