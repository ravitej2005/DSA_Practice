import java.util.ArrayList;

public class prog1 {
  // public static void combinationsWithKElements(int ind, ArrayList<Integer> al, int[] arr, int k){
  //   if (al.size()==2) {
  //     System.out.println(al);
  //     return;
  //   }

  //   if (ind == arr.length) {
  //     return;
  //   }
  //   al.add(arr[ind]);
  //   combinationsWithKElements(ind+1, al, arr, k);
  //   al.remove(al.size()-1);
  //   combinationsWithKElements(ind+1, al, arr, k);
  // }
  public static void combinationsWithKElements(int ind, ArrayList<Integer> al, int[] arr, int k){
    if (al.size()==2) {
      System.out.println(al);
      return;
    }

    for (int i = ind; i < arr.length; i++) {
      al.add(arr[i]);
      combinationsWithKElements(i+1, al, arr, k);
      al.remove(al.size()-1);
    } 
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    int k = 2;
    combinationsWithKElements(0, new ArrayList<>(), arr, k);
  }
}