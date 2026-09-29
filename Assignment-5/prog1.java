class prog {
  static int solution(int[] arr, int k){
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i]==arr[j] && (i*j)%k==0 ) {
          count++;
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int[] nums = {3,1,2,2,2,1,3};
    int k = 2;
    // int k = 1;
    // int[] nums = {1,2,3,4};
    System.out.println(solution(nums, k));
  }
}