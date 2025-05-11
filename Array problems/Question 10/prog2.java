import java.util.ArrayList;

class prog2 {
  static int[] findPairSum(int[] arr, int target){
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      al.add(arr[i]);
      if (al.contains(target - arr[i])) {
        int ind = al.indexOf(target - arr[i]);
        return new int[]{ind, i};
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