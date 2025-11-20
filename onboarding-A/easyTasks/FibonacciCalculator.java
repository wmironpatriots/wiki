public class FibonacciCalculator {

        public static void main(String[] args) {
            int n = 64; 
            long[] fibNumbers = new long[n];
    
     
            
            fibNumbers[0] = 0;
            fibNumbers[1] = 1;
            
    
     
            for (int i = 2; i < n; i++) {
                fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
               
            }
            for (int i = 0; i < 64; i++)
            {
              System.out.println(fibNumbers[i]);
            }
        }
    }
   