import java.util.Arrays;

class prog1 {
  static void findNums(int[] arr){
    Arrays.sort(arr);
    int n = arr.length/3;
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      while ((i+1)<arr.length && arr[i]==arr[i+1]) {
        count++;
        i++;
      } 
      if (count>n) {
        System.out.println(arr[i]);
        count = 1;
      }
      
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,2,2,3,2};
    // int[] arr = {11,33,33,11,33,11};
    findNums(arr);
  }
}