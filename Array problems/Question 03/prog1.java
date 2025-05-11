//rotate array problem

import java.util.Scanner;

class prog1 {
  static int[] leftRotateArray(int[] arr,int k){ 
    int[] temp = new int[arr.length];
    int len = arr.length;
    for (int i = 0; i < temp.length; i++) {
      int num = i-k;
      if (num>=0) {
        temp[num] = arr[i];
      } else{
        temp[len+num] = arr[i];
      }
    }
    return temp;
  }

  static int[] rightRotateArray(int[] arr,int k){ 
    int[] temp = new int[arr.length];
    int len = arr.length;
    for (int i = 0; i < temp.length; i++) {
      int num = i+k;
      if (num<len) {
        temp[num] = arr[i];
      } else{
        temp[num-len] = arr[i];
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    // int[] arr = {3,7,8,9,10,11};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    // int[] leftRotatedArray = leftRotateArray(arr,num); // Space Complexity = O(n) ; Time complexity = O(n) 
    int[] leftRotatedArray = rightRotateArray(arr,num); // Space Complexity = O(n) ; Time complexity = O(n) 
    for (int i = 0; i < leftRotatedArray.length; i++) {
      System.out.print(leftRotatedArray[i]+" ");
    }
    sc.close();
  }
}