package Subsequence;
import java.util.ArrayList;

class prog {
  public static void generateSubsequence(int[] arr, int ind, ArrayList<Integer> al){
    if (ind == arr.length) {
      System.out.println(al);
      return;
    }
    
    al.add(arr[ind]);
    generateSubsequence(arr, ind+1, al);
    al.remove(al.size()-1);
    generateSubsequence(arr, ind+1, al);
  }

  public static void main(String[] args) {
    // int[] arr = {7,6,2,9};
    int[] arr = {8,3,7,2,6};
    generateSubsequence(arr,0,new ArrayList<Integer>());
  }
}