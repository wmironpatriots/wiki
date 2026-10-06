public class fibonacciSequence {
    public static void main(String[] args) {
        long n = 64;
        long firstTerm = 0;
        long secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
