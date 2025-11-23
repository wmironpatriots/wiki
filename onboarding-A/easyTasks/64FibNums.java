public class 64FibNums{
  public static void main(String[] args){
    ArrayList<Integer> fibArray = new ArrayList<>();
    fibArray.add(0);
    fibArray.add(1);
    for(int i = 2; i < 64; i++){
      fibArray.add(fibArray.get(i-1)+fibArray.get(i-2));
    }
    for(int num : fibArray){
      System.out.println(num + " ");
    }
  }
}
