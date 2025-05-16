import java.util.HashMap;

class prog2 {
  static boolean checkRotatedString(String s,String t){
    if (s.length()!=t.length()) {
      return false;
    }
    String s1 = "";
    String t1 = "";
    HashMap<Character, Integer> hm1 = new HashMap<>();
    HashMap<Character, Integer> hm2 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i),i));
      s1 = s1+hm1.get(s.charAt(i));
      hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i),i));
      t1 = t1+hm2.get(t.charAt(i));
    }
    System.out.println(s1+" "+t1);
    if (!s1.equals(t1)) {
      return false;
    }
    return true;
  } 

  public static void main(String[] args) {
    // String s = "egg";
    // String t = "add";
    // String s = "foo";
    // String  t= "bar";
    String s = "paper";
    String  t= "title";
    
    System.out.println(checkRotatedString(s,t));
  }
}