//Finding maximum element in an array

class prog5 {
  static int max = Integer.MIN_VALUE;
  static void findMaxElement(int[] arr, int i){
    if (arr[i]>max) {
      max = arr[i];
    } 
    if (i<arr.length-1) {
      findMaxElement(arr, ++i);
    }
  }
  public static void main(String[] args) {
    int[] arr = {2, 5, 9, 16, 6} ;
    findMaxElement(arr,0);
    System.out.println("Max element in array : "+max);
  }
}