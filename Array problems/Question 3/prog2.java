//rotate array problem (array reversal method)

import java.util.Scanner;

class prog2 {
  static void reverseArray(int[] arr, int start, int end){
    while (start<end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void leftRotateArray(int[] arr,int k){
    reverseArray(arr, 0, k-1);
    reverseArray(arr, k, arr.length-1);
    reverseArray(arr, 0, arr.length-1);
  }

  static void rightRotateArray(int[] arr,int k){
    int len = arr.length;
    reverseArray(arr, len-k , len-1);
    reverseArray(arr, 0, len-k-1);
    reverseArray(arr, 0, len-1);
  }

  public static void main(String[] args) {
    // int[] arr = {1,2,3,4,5,6,7};
    int[] arr = {3,7,8,9,10,11};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    leftRotateArray(arr,num);
    // rightRotateArray(arr,num);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}