public class MyProgram {
    public static void main(String[] args) {
        int n = 64;
        long fib1 = 0, fib2 = 1; # what is wrong here tho

        for (int i = 1; i <= n; ++i) {
            System.out.println(fib1);
            long sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
    }
}