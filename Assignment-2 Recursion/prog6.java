class prog6 {
  static boolean checkSorted(int[] arr, int i){
    boolean isSorted = true;
    if (arr[i]>=arr[i+1]) {
      isSorted = false;
    } else if(i<(arr.length-2)){
      isSorted = checkSorted(arr, ++i);
    }
    return isSorted;
  }
  public static void main(String[] args) {
    // int[] arr1 = {1,2,3,4};
    int[] arr2 = {1,2,2,4};
    boolean isSorted = checkSorted(arr2, 0);
    System.out.println(isSorted);
  }
}