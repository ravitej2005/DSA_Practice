//check if two string are close

import java.util.HashMap;

class prog18 {
  static boolean solution(String str1, String str2){
    if (str1.length()!=str2.length()) {
      return false;
    }
    
    HashMap<Character,Integer> hm1 = new HashMap<>();
    HashMap<Character,Integer> hm2 = new HashMap<>();
    
    for (int i = 0; i < str1.length(); i++) {
      hm1.put(str1.charAt(i), hm1.getOrDefault(str1.charAt(i), 0)+1);
      hm2.put(str2.charAt(i), hm2.getOrDefault(str2.charAt(i), 0)+1);
    }

    if (hm1.size()!=hm2.size()) {
      return false;
    }

    for (char ch : hm1.keySet()) {
      if (!hm2.containsKey(ch)) {
        return false;
      } 
    }

    for (int a : hm1.values()) {
      if (!hm2.containsValue(a)) {
        return false;
      } 
    }
    return true;
  }
  public static void main(String[] args) {
    String str1 = "cabbba";
    String str2 = "abbccc";
    System.out.println(solution(str1, str2));
  }
}