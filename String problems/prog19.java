import java.util.HashMap;
import java.util.HashSet;

class prog19 {
  static boolean solution(String str1, String str2) {
    HashMap<Character, String> hm = new HashMap<>();
    String[] words = str2.split(" ");
    if (words.length != str1.length()) {
      return false;
    }

    HashSet<String> hs = new HashSet<>();

    for (int i = 0; i < words.length; i++) {
      if (hm.containsKey(str1.charAt(i))) {
        if (!hm.get(str1.charAt(i)).equals(words[i])) {
          return false;
        }
      } else {
        if (hs.contains(words[i])) {
          return false;
        }
      }
      hm.put(str1.charAt(i), words[i]);
      hs.add(words[i]);
    }

    return true;
  }
  // static boolean solution(String pattern, String s){
  // String[] words = s.split(" ");
  // if (pattern.length() != words.length) return false;

  // HashMap<Character, String> hm = new HashMap<>();
  // HashSet<String> set = new HashSet<>();

  // for (int i = 0; i < pattern.length(); i++) {
  // char c = pattern.charAt(i);
  // String w = words[i];

  // if (hm.containsKey(c)) {
  // if (!hm.get(c).equals(w)) return false;
  // } else {
  // if (set.contains(w)) return false;
  // hm.put(c, w);
  // set.add(w);
  // }
  // } 
  // return true;
  // }

  public static void main(String[] args) {
    String str1 = "abba";
    String str2 = "dog cat cat dog";
    System.out.println(solution(str1, str2));
  }
}