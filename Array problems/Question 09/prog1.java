class prog1 {
  static int getConsecutiveOnesCount(int[] arr) {
    int count = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==1) {
        count++;
      } else {
        count=0;
      }
      max = Math.max(max, count);
    }
    return max;
  }
  

  public static void main(String[] args) {
    // int[] arr = { 1, 1, 0, 1, 1, 1 };
    int[] arr = { 1, 0, 1, 1, 0, 1 };
    int consecutiveCount = getConsecutiveOnesCount(arr);
    System.out.println(consecutiveCount);
  }
}