public class fibonacci{    
    /*
     * code made on 11/20/25
     * ---------
     * made this on 2nd day of learning java so thats cool
     * i didnt know about arrays before making this but dont fix whats not broken
     * ---------
     */
    public static void main(String[] args){
        System.out.print("0"+ " ");
        System.out.print("1" + " ");
        long lastNum = 0;
        long currentNum = 1;
        long evenNowNum = 1;
        for (int i = 0; i<65; i++){
        evenNowNum = lastNum + currentNum;
        lastNum = currentNum;
        currentNum = evenNowNum;
        System.out.print(evenNowNum + " ");
        }
    }

}