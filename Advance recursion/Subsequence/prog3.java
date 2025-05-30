package Subsequence;

import java.util.ArrayList;

class prog3 {
  public static boolean generateSubsequence(int[] arr, int ind, int sum, int k, ArrayList<Integer> al) {
    if (sum == k) {
      System.out.println(al);
      return true;
    }
    if (ind == arr.length) {
      return false;
    }
    
    al.add(arr[ind]);
    if (generateSubsequence(arr, ind + 1, sum + arr[ind], k, al)) {
      return true;
    } else {
      al.remove(al.size()-1);
      return generateSubsequence(arr, ind + 1, sum, k, al);
    }

  }

  public static void main(String[] args) {
    // int[] arr = {7,6,2,9};
    // int[] arr = {8,3,7,2,6};
    int[] arr = {1,2,3};
    int k = 5;
    System.out.println(generateSubsequence(arr,0,0,k, new ArrayList<Integer>())); 
  }
}