public class App {
    public static void main(String[] args) {
        long digitOne = 0;
        long digitTwo = 1;
        long third = 0;
        int numberOfNumbers = 64;

        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println(digitOne);

            third = digitOne + digitTwo;
            digitOne = digitTwo;
            digitTwo = third;
        }
    }
}
