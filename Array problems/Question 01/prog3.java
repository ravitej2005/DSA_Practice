//Most optimised way

class prog3 {
  static int sortArray(int[] arr){
    int i = 0;
    int j = 0;
    while (j<arr.length) {
      if (arr[i]!=arr[j]) {
        i++;
        arr[i]=arr[j];
      }
      j++;
    }
    return i+1;
  }
  
  public static void main(String[] args) {
    // int[] arr = {1,2,2,3,1,4};
    int[] arr = {5,5,5,7,7,9};
    // int[] arr = {5,8,2,7,1,9};
    // int[] arr = {4,5,1,2,4};
    // int[] arr = {10,20,10,30,40};
    int distinctElemenets = sortArray(arr);
    System.out.println(distinctElemenets);
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]+" ");
    }
  }
}