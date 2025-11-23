public class Fibonacci {
    public static void main(String[] args) {
        long x = 0L;
        long y = 1L;

        for (int i = 0; i < 64; i++) {
            System.out.println(x);
            long temp = x + y;
            x = y;
            y = temp;
        }
    }
}