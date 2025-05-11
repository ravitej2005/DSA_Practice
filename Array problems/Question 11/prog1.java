class prog1 {
  static void sortArray(int[] arr){
    int zeros=0;
    int ones=0;
    int twos=0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==0) {
        zeros++;
      } else if (arr[i]==1) {
        ones++;
      } else {
        twos++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (i<zeros) {
        arr[i] = 0;
      } else if (i<zeros+ones) {
        arr[i] = 1;
      } else{
        arr[i] = 2;
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {2,0,2,1,1,0};
    // int[] arr = {2,0,1};
    // int[] arr = {0};
    sortArray(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}