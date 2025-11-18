public class MyProgram
{
    public static void main(String[] args)
    {
        long[] fib = new long[64];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < 64; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        for (int i =0; i < 64; i++)
        {
            System.out.print(fib[i] + " ");
        }
    }

}