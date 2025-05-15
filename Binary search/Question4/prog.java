class prog {
  static void binarySearch(int[] arr, int x){
    int low = 0;
    int high = arr.length-1;
    int ans = -1;
    while (low<=high) {
      int mid = high + (low-high)/2;
      if (arr[mid]>=x) {
        ans = mid;
        high = mid-1;
      } else {
        low = mid+1;
      }
    }
    if (arr[ans]==x) {
      System.out.println(arr[ans]+" "+arr[ans]);
    } else{
      System.out.println(arr[ans-1]+" "+arr[ans]);
    }
  }
  public static void main(String[] args) {
    int[] arr = {3,4,4,7,8,10};
    // int x = 5;
    int x = 8;
    binarySearch(arr, x);

  }
}