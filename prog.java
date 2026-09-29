import java.util.HashMap;

class prog {
  static int fun(int[] fruits, int k){
    int count = 0;
    HashMap<Integer,Integer> hm = new HashMap<>(); 
    for (int i = 0; i < fruits.length; i++) {
      if (hm.size()<k) {
        hm.put(fruits[i], hm.getOrDefault(fruits[i], 0)+1);
        count++;
      }else if (hm.size()==k) {
        if (hm.containsKey(fruits[i])) {
          hm.put(fruits[i], hm.get(fruits[i])+1);
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int[] fruits = {1,2,1,3,4};
    int k = 2;
    System.out.println(fun(fruits,k));
  }
}
