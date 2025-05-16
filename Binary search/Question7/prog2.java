class prog {
  static boolean binarySearch(int[] arr, int k){
    int low = 0;
    int high = arr.length-1;
    if (low<=high) {
      int mid = high + (low-high)/2;
      if (arr[mid]==k) {
        return true;
      }
      if (arr[low]<=arr[mid]) {
        if (arr[low]<=k && k<=arr[mid]) {
          high = mid-1;
        }else{
          low = mid+1;
        }
      }else{
        if (arr[mid]<=k && k<=arr[high]) {
          low = mid+1;
        }else{
          high = mid-1;
        }
      }
    }
    // while (low<=high) {
    //   int mid = high + (low-high)/2;
    //   if (arr[mid]==k) {
    //     return true;
    //   }
    //   if (arr[low]<=arr[mid]) {
    //     if (arr[low]<=k && k<=arr[mid]) {
    //       high = mid-1;
    //     }else{
    //       low = mid+1;
    //     }
    //   }else{
    //     if (arr[mid]<=k && k<=arr[high]) {
    //       low = mid+1;
    //     }else{
    //       high = mid-1;
    //     }
    //   }
    // }
    return false;
  }
  public static void main(String[] args) {
    // int[] arr = {7,8,1,2,3,3,3,4,5,6};
    int[] arr = {3,3,1,1,3,3,3,3,3,3,3};
    // int k = 3;
    int k = 1;
    System.out.println(binarySearch(arr, k));
  }
}