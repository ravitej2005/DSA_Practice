class prog2 {
  static int getAbsentNumber(int[] arr, int n){
    int ans = 0;
    for (int i = 1; i <= arr.length; i++) {
        ans ^= i^arr[i-1];
    }    
    return ans^n;
  }
  public static void main(String[] args) {
    int n = 5;
    int[] arr = {1,2,4,5};
    // int n = 3;
    // int[] arr = {1,3};
    int num = getAbsentNumber(arr, n);
    System.out.println(num);
  }
}