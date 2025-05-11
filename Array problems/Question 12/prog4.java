//Boyer & Moore's Algorithm

import java.util.Arrays;

class prog3 {
  static int findNum(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length/2];
  }
  public static void main(String[] args) {
    // int[] arr = {2,2,1,1,1,2,2};
    // int[] arr = {4,4,2,4,3,4,4,3,2,4};
    int[] arr = {3,2,3};
   
    int num = findNum(arr);
      System.out.println(num);
    
  }
}