class prog {
  static int binarySearch(int[] arr, int k){
    int low = 0;
    int high = arr.length-1;
    while (low<=high) {
      int mid = high + (low-high)/2;
      if (arr[mid]==k) {
        return mid;
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
    return -1;
  }
  public static void main(String[] args) {
    // int[] arr = {4,5,6,7,0,1,2,3};
    // int k = 0;
    int[] arr = {4,5,6,7,0,1,2};
    int k = 3;
    System.out.println(binarySearch(arr, k));

  }
}