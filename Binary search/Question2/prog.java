class prog {
  static int binarySearch(int[] arr, int x){
    int low = 0;
    int high = arr.length-1;
    int ans = -1;
    while (low<=high) {
      int mid = high + (low-high)/2;
      if (arr[mid]>x) {
        ans = mid;
        high = mid-1;
      }else{
        low = mid+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    // int[] arr = {1,2,2,3};
    // int x = 2;
    int[] arr = {3,5,8,9,15,19};
    int x = 9;
    System.out.println(binarySearch(arr, x));

  }
}