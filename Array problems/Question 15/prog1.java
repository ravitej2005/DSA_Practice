import java.util.HashMap;

class prog1 {
  static void findNums(int[] arr){
    int N = arr.length;
    HashMap<Integer,Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
    }
    for (int key : hm.keySet()) {
      if (hm.get(key)>N/3) {
        System.out.println(key);
      }
    }
  }
  public static void main(String[] args) {
    // int[] arr = {1,2,2,3,2};
    int[] arr = {11,33,33,11,33,11};
    findNums(arr);
  }
}