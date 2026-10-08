class Fibonacci_easy_task{
    public static void main(String[] args){
        long nextNumber;
        long currentNumber = 1;
        long previousNumber = 0;

        for (int i = 0; i <64; i ++){
            nextNumber = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            System.out.println(currentNumber);
        }
    }
}
