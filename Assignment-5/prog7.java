class prog7 {
  static int[] solution1(int[] nums, int k){
    int[] ans = new int[nums.length];
    int numsi = 0;
    int numsj = nums.length-1;
    int ansi = 0;
    int ansj = nums.length-1;
    while (ansi<=ansj) {
      if (numsi>=nums.length && numsj<0 && ansi<=ansj) {
        ans[ansi] = k;
        ansi++;
      }
      if (numsi<nums.length && nums[numsi]<k) {
        ans[ansi] = nums[numsi];
        ansi++;
      }
      if (numsj>= 0 && nums[numsj]>k) {
        ans[ansj] = nums[numsj];
        ansj--;
      }
      numsi++;
      numsj--;
    }
    return ans;
  }

  // static void rearrange(int start, int end, int[] nums){
  //   int tmp = nums[end];
  //   if (start<end) {
  //     for (int i = end; i > start ; i--) {
  //       nums[i] = nums[i-1];
  //     }
  //   } else if (start>end) {
  //     for (int i = end; i < start ; i++) {
  //       nums[i] = nums[i+1];
  //     }
  //   }
  //   nums[start] = tmp;
  // }

  // static void solution2(int[] nums, int k){
  //   int start = 0;
  //   int end = nums.length-1;
  //   int i = 0;
  //   int j = nums.length-1;
  //   while(start<=end){
  //     if (start==j && end==i && nums[start]<=k && nums[end]>=k && start<=end) {
  //       nums[start] = k;
  //       start++;
  //     }

  //     if (i<nums.length && nums[i]<k) {
  //       rearrange(start, i, nums);
  //       start++;
  //     }
  //       i++;

  //     if (j>=0 && nums[j]>k) {
  //       rearrange(end, j, nums);
  //       end--;
  //     }
  //       j--;

  //     if (j<start) {
  //       j = start;
  //     }
  //     if (i>end) {
  //       i = end;
  //     }
  //   }
  // }

  public static void main(String[] args) {
    int[] nums = {9,12,5,10,14,3,10};
    int k = 10;
    // int[] nums = {-3,4,3,2};
    // int k = 2;
    // int[] nums = {5,5,5};
    // int k = 5;
    int[] answer = solution1(nums, k);
    for (int i = 0; i < answer.length; i++) {
      System.out.print(answer[i]+" ");
    }
    // solution2(nums, k);
    // for (int i = 0; i < nums.length; i++) {
    //   System.out.print(nums[i]+" ");
    // }
  }
}