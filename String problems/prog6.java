import java.util.HashMap;

class prog6 {
  static HashMap<Character,Integer> charFrequency(String str){
    HashMap<Character,Integer> hm = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0)+1);
    }
    return hm;
  }
  public static void main(String[] args) {
    System.out.println(charFrequency("aabcadcbe"));
  }
}