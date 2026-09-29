class prog {
  static int solution(int[] arr){
    int count = 0;
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i]>=arr[i+1]) {
        count += arr[i]-arr[i+1] + 1;
        arr[i+1] += arr[i]-arr[i+1] + 1;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    // int[] arr = {1,1,1};
    int[] arr = {0};
    // int[] arr = {1,5,2,4,1};
    System.out.println(solution(arr));
  }
}