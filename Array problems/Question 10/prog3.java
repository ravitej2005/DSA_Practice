import java.util.HashMap;

class prog3 {
  static int[] findPairSum(int[] arr, int target){
    HashMap<Integer,Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      hm.put(arr[i], i);
      int x = hm.getOrDefault(target-arr[i], -1);
      if (x!=-1) {
        return new int[]{x, i};
      }
    }
    return new int[]{-1,1};
  }
  public static void main(String[] args) {
    int[] arr = {2,6,5,8,11};
    int target = 14;
    // int[] arr = {2,6,5,8,11};
    // int target = 15;
    int[] pairSum = findPairSum(arr, target);
    for (int i = 0; i < pairSum.length; i++) {
      System.out.println(pairSum[i]);
    }
  }
}