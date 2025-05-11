import java.util.HashMap;

class prog1 {
  static int sortArray(int[] arr){
    HashMap<Integer,Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
    }
    System.out.println(hm);
    int i = 0;
    for (int key : hm.keySet()) {
      arr[i++] = key;
    }
    return hm.size();
  }

  public static void main(String[] args) {
    // int[] arr = {1,2,2,3,1,4};
    int[] arr = {5,5,5,7,7,9};
    // int[] arr = {5,8,2,7,1,9};
    // int[] arr = {4,5,1,2,4};
    // int[] arr = {10,20,10,30,40};
    int distinctElemenets = sortArray(arr);
    System.out.println(distinctElemenets);
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]+" ");
    }
  }
}