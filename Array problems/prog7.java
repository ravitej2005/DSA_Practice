//Move all zeros to the end of the array

class prog7 {
  static void sortArray(int[] arr){
    int i = 0;
    int j = 0;
    while (j<arr.length) {
      if (arr[j]!=0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
      }
      j++;
    }
  }
  public static void main(String[] args) {
    // int[] arr = {1,0,2,3,0,4,2,1,0,0,3};
    // int[] arr = {1,1,2,3,7,4,2,1,3};
    int[] arr = {0,0,0,0,0,0,0,};
    sortArray(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }
}