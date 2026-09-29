import java.util.ArrayList;

public class prog2 {
  
  public static void combinationSum(int ind,int sum, ArrayList<Integer> al, int[] arr, int k){
    if (sum==k) {
      System.out.println(al);
      return;
    }
    
    if (sum>k || ind==arr.length) {
      return;
    }

    sum+=arr[ind];
    al.add(arr[ind]);
    combinationSum(ind, sum, al, arr, k);
    sum-=arr[ind];
    al.remove(al.size()-1);
    combinationSum(ind+1, sum, al, arr, k);
  }
  public static void main(String[] args) {
    int[] arr = {2,3,6,7};
    int k = 7;
    combinationSum(0, 0,new ArrayList<>(), arr, k);
  }
}