import java.util.ArrayList;

public class prog3 {
  
  public static void combinationSum(int ind,int sum, ArrayList<Integer> al, int[] arr, int k){
    if (sum==k) {
      System.out.println(al);
      return;
    }
    
    if (sum>k || ind==arr.length) {
      return;
    }

    al.add(arr[ind]);
    sum += arr[ind];
    combinationSum(ind+1, sum, al, arr, k);
    al.remove(al.size()-1);
    sum -= arr[ind];
    combinationSum(ind+1, sum, al, arr, k);
  }

  public static void main(String[] args) {
    int[] arr = {1,1,2,3,5,7,9};
    int k = 8;
    combinationSum(0, 0,new ArrayList<>(), arr, k);
  }
}