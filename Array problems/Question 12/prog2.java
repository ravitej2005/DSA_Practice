import java.util.HashMap;

class prog2 {
  static int findNum(int[] arr){
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
      if (hm.get(arr[i])>arr.length/2) {
        return arr[i];
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    // int[] arr = {2,2,1,1,1,2,2};
    // int[] arr = {4,4,2,4,3,4,4,3,2,4};
    int[] arr = {3,2,3};
   
    int num = findNum(arr);
      System.out.println(num);
    
  }
}