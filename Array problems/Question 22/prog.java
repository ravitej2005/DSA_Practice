class prog {
  static int solution(int[] arr, int d , int start){
    if ((start+d)<arr.length) {
      for (int i = start; i < start+d; i++) {
        if (arr[i]>arr[i+1]) {
          solution(arr, d, i+1);
        }
      }
    }

    if (start-d>=0) {
      for (int i = start; i > start-d; i--) {
        
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {6,4,14,6,8,13,9,7,10,6,12};
    int d = 2;
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans = Math.max(ans, solution(arr,d,0));
    }
    System.out.println(ans);
  }
}