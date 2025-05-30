package Subsequence;

import java.util.ArrayList;

class prog2 {
  // this function can run as long as all elements are positive & greater than
  // zero
  // public static void generateSubsequence(int[] arr, int ind, ArrayList<Integer>
  // al, int sum, int k){
  // if (sum==k) {
  // System.out.println(al);
  // return;
  // }

  // if (ind == arr.length) return;

  // al.add(arr[ind]);
  // if (sum+arr[ind]<=k) {
  // generateSubsequence(arr, ind+1, al,sum+arr[ind], k);
  // }
  // al.remove(al.size()-1);
  // generateSubsequence(arr, ind+1, al,sum, k);
  // }

  //this function can run even if elements are negative or zero
  public static void generateSubsequence(int[] arr, int ind, ArrayList<Integer> al, int sum, int k) {

    if (ind == arr.length) {
      if (sum == k) {
        System.out.println(al);
      }
      return;
    }

    al.add(arr[ind]);
    generateSubsequence(arr, ind + 1, al, sum + arr[ind], k);

    al.remove(al.size() - 1);
    generateSubsequence(arr, ind + 1, al, sum, k);
  }

  public static void main(String[] args) {
    // int[] arr = {7,6,2,9};
    // int[] arr = {8,3,7,2,6};
    int[] arr = { 1, 2, 3 };
    int k = 3;
    generateSubsequence(arr, 0, new ArrayList<Integer>(), 0, k);
  }
}