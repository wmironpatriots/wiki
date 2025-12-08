public class Fibbo {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < 64; i++) {
            long next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}
