class prog1 {
  static int getUniqueNumber(int[] arr){
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
        ans ^= arr[i];
    }    
    return ans;
  }
  public static void main(String[] args) {
    // int[] arr = {2,2,1};
    int[] arr = {4,1,2,1,2};
    int num = getUniqueNumber(arr);
    System.out.println(num);
  }
}