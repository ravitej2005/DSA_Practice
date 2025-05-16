import java.util.HashMap;

class prog {
  static boolean checkAnagram(String s,String t){
    if (s.length()!=t.length()) {
      return false;
    }
    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
      hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0)-1);
    }
    for(char a : hm.keySet()){
      if (hm.get(a)!=0) {
        return false;
      }
    }
    return true;
  } 

  public static void main(String[] args) {
    // String s = "CAT";
    // String  t= "ACT";
    String s = "RULES";
    String  t= "LESRT";
    System.out.println(checkAnagram(s,t));
  }
}