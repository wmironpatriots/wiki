public class FibonacciCalculator {

    public static void main(String[] args) {
        int n = 64; 
        long[] fibNumbers = new long[n];

 
        if (n >= 1) {
            fibNumbers[0] = 0;
        }
        if (n >= 2) {
            fibNumbers[1] = 1;
        }

 
        for (int i = 2; i < n; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }

        
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println("F(" + i + ") = " + fibNumbers[i]);
        }
    }
}
