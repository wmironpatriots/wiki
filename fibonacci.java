public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int nextNum;

        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= 10; i++) {
            nextNum = num1 + num2;
            System.out.print(nextNum + " ");

            num1 = num2;
            num2 = nextNum;
        }
    }
}



