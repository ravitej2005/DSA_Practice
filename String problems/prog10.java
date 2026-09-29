import java.util.HashSet;

class prog10 {
  static Character firstRepeatedChar(String str){
    Character ch = null;
    HashSet<Character> hs = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      if (hs.contains(str.charAt(i))) {
        return str.charAt(i);
      } else {
        hs.add(str.charAt(i));
      }
    }
    return ch;
  }
  public static void main(String[] args) {
    System.out.println(firstRepeatedChar("abcde"));
    System.out.println(firstRepeatedChar("banana"));
  }
}