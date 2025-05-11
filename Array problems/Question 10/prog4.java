import java.util.Arrays;

class prog4 {
  static int[] findPairSum(int[] arr, int target){
    Arrays.sort(arr);
    int i = 0;
    int j = arr.length-1;
    while (i<j) {
      if (arr[i]+arr[j]==target) {
        return new int[]{i,j};
      } else if (arr[i]+arr[j]<target) {
        i++;
      } else {
        j--;
      }
    }
    return new int[]{-1,1};
  }
  public static void main(String[] args) {
    // int[] arr = {2,6,5,8,11};
    // int target = 14;
    int[] arr = {2,12,5,8,11};
    int target = 14;
    // int[] arr = {2,6,5,8,11};
    // int target = 15;
    int[] pairSum = findPairSum(arr, target);
    for (int i = 0; i < pairSum.length; i++) {
      System.out.println(pairSum[i]);
    }
  }
}