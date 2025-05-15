class prog1 {
  static int[] sortArray(int[] arr){
    int[] sortedArr = new int[arr.length];
    int even = 0;
    int odd = 1;
    // int j = i;
    for (int j = 0; j < arr.length; j++) {
      if (arr[j]<0) {
        sortedArr[odd] = arr[j];
        odd+=2;
      } else{
        sortedArr[even] = arr[j];
        even+=2;
      }
    }
    return sortedArr;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,-4,-5};
    // int[] arr = {1,2,-3,-1,-2,3};
   
    int[] sortedArr = sortArray(arr);
    for (int i = 0; i < sortedArr.length; i++) {
      System.out.print(sortedArr[i]+" ");
    }
    
  }
}