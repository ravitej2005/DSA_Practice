class prog {
  static int solution(int[] arr){
    int max = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      max = Math.max(max, sum);
    }
    return max;
  }
  public static void main(String[] args) {
    int[] gain = {-5,1,5,0,-7};
    // int[] gain = {-4,-3,-2,-1,4,3,2};
    System.out.println(solution(gain));
  }
}