import java.util.HashSet;

class prog23 {
  static char Solution(String str){
    HashSet<Character> hs = new HashSet<>();
    char max = 'A';
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLowerCase(str.charAt(i)) && hs.contains(Character.toUpperCase(str.charAt(i)))) {
        if (max<Character.toUpperCase(str.charAt(i))) {
          max = Character.toUpperCase(str.charAt(i));
        }
      } else if(Character.isUpperCase(str.charAt(i)) && hs.contains(Character.toLowerCase(str.charAt(i)))){
        if (max<str.charAt(i)) {
          max = str.charAt(i);
        }
      }
      hs.add(str.charAt(i));
    }
    return max;
  }
  public static void main(String[] args) {
    System.out.println(Solution("arRAzFif"));
  }
}