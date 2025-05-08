//forward and backward printing of an array
class prog1 {
  static void forwardPrint(int[] arr, int counter){
    if (counter < arr.length) {
      System.out.print(arr[counter++]+" ");
      forwardPrint(arr, counter);
    }
  }
  static void backwardPrint(int[] arr, int counter){
    if (counter>=0) {
      System.out.print(arr[counter--]+" ");
      backwardPrint(arr, counter);
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    forwardPrint(arr,0);
    System.out.println();
    backwardPrint(arr, (arr.length-1));
  }
}