//Isomorphic Strings

import java.util.HashMap;

class prog16 {
  static boolean solution(String s1, String s2){
    if (s1.length() != s2.length()) {
      return false;
    }

    HashMap<Character,Integer> hm1 = new HashMap<>();
    HashMap<Character,Integer> hm2 = new HashMap<>();
    int j = 1;
    int k = 1;
    for (int i = 0; i < s1.length(); i++) {
      hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i), j++));
      hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i), k++));
    }

    if (hm1.size()!=hm2.size()) {
      return false;
    }

    StringBuilder str1 = new StringBuilder("");
    StringBuilder str2 = new StringBuilder("");

    for (int i = 0; i < s1.length(); i++) {
      str1.append(hm1.get(s1.charAt(i)));
      str2.append(hm2.get(s2.charAt(i)));
    }

    return str1.toString().equals(str2.toString());
  }
  public static void main(String[] args) {
    // String s1 = "foo";
    // String s2 = "bar";
    // String s1 = "pazer";
    // String s2 = "title";
    String s1 = "xxy";
    String s2 = "aab";
    System.out.println(solution(s1, s2));
  }
}