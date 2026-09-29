import java.util.HashMap;
import java.util.HashSet;

class prog21 {
  static int solution1(String str) {
    int count = 0;
    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
    }
    HashSet<Integer> hs = new HashSet<>();
    for (int ele : hm.values()) {
      while (hs.contains(ele) && ele>0) {
        ele--;
        count++;
      }
      hs.add(ele);
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(solution1("ceabaacb"));
  }
}