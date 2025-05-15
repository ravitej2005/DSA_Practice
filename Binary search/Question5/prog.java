class prog {
  static int binarySearch(int[] arr, int target){
    int low = 0;
    int high = arr.length-1;
    int ans = -1;
    if (!(arr[low]<=target && target<=arr[high])) {
      return -1;
    }
    while (low<=high) {
      int mid = high + (low-high)/2;
      if (arr[mid]>target) {
        ans = mid;
        high = mid-1;
      } else {
        low = mid+1;
      }
    }
    return ans-1;
  }
  public static void main(String[] args) {
    int[] arr = {3,4,13,13,13,20,40};
    int target = 13;
    // int target = 60;
    System.out.println(binarySearch(arr, target));

  }
}