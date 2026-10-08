public class Fibonacci {
    public static void main(String[] args){
        long first_number = 0;
        long second_number = 1;

        for (int i = 0; i < 64; i++){
            System.out.print(first_number + " ");

            long next = first_number+second_number;
            first_number = second_number;
            second_number = next;
        }
    }    
}