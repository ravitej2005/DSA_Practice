//Dutch national flag algorithm

class prog2 {
  static void sortArray(int[] arr){
    int low = 0;
    int high = arr.length-1;
    int mid = 0;
    while (mid<=high) {
      if (arr[mid]==0) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
        low++;
        mid++;
      }else if (arr[mid]==2) {
        int temp = arr[high];
        arr[high] = arr[mid];
        arr[mid] = temp;
        high--;        
      } 
      else{
        mid++;
      }
    }
  }
  public static void main(String[] args) {
    // int[] arr = {2,0,2,1,1,0};
    // int[] arr = {1,0,2,1,2,1};
    // int[] arr = {2,0,1};
    int[] arr = {0};
    sortArray(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}