package Subsequence;

import java.util.ArrayList;

class prog3 {
  public static int generateSubsequence(int count, int[] arr, int ind, int sum, int k, ArrayList<Integer> al) {
    if (ind==arr.length) {
      if (sum==k) {
        System.out.println(al);
        count++;
      }
      return count;
    }
    al.add(arr[ind]);
    count = generateSubsequence(count, arr, ind+1, sum+arr[ind], k, al);
    al.remove(al.size()-1);
    count = generateSubsequence(count, arr, ind+1, sum, k, al);
    return count;
  }

  public static void main(String[] args) {
    // int[] arr = {7,6,2,9};
    // int[] arr = {8,3,7,2,6};
    int[] arr = {1,2,3};
    int k = 3;
    System.out.println(generateSubsequence(0,arr,0,0,k, new ArrayList<Integer>())); 
  }
}