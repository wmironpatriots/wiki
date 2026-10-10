package wiki;
public class Fibonacci{
    public static void main (String [] args) {
        long[] fibonacci = new long[65];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2;  i < 65; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        } 
        for (int i = 0; i < 65; i++){
            System.out.print(fibonacci[i]);
        
    // BRO IDK HOW TO PUT COMMAS OK IM USING AI I QUIT
            if (i < 65) {
                System.out.print(", ");
            }
        }
    }
}
// ok i think it worked why is it still pooping out a bunch of bs :((((((((