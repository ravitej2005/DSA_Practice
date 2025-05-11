class prog1 {
  static int[] findPairSum(int[] arr, int target){
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i]+arr[j]==target) {
          return new int[]{i,j};
        }
      }
    }
    return new int[]{-1,1};
  }
  public static void main(String[] args) {
    // int[] arr = {2,6,5,8,11};
    // int target = 14;
    int[] arr = {2,6,5,8,11};
    int target = 15;
    int[] pairSum = findPairSum(arr, target);
    for (int i = 0; i < pairSum.length; i++) {
      System.out.println(pairSum[i]);
    }
  }
}