class prog {
  static int binarySearch(int[] arr, int x){
    int low = 0;
    int high = arr.length-1;
    int ans = -1;
    while (low<=high) {
      int mid = high + (low-high)/2;
      if (arr[mid]>=x) {
        ans = mid;
        high = mid-1;
      }else{
        low = mid+1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,4,7};
    // int x = 6;
    int x = 2;
    System.out.println(binarySearch(arr, x));

  }
}