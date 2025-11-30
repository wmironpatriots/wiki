public class fibb{
    public static void main(String[] args) {
        fibber(64);
    }
    
    public static int fibber(int n){
        int current = 0;;
        if(n <= 1){
            current = n;
            System.out.print(current + ", ");
            return current;
        }
        current = fibber(n-1) + fibber(n-2);
        System.out.print(current + ", ");
        return current;

    }

}