import java.util.HashSet;

class prog9 {
  // static String solution(String str1, String str2){
  //   StringBuilder ans = new StringBuilder("");
  //   for (int i = 0; i < str1.length(); i++) {
  //     if (!str2.contains(""+str1.charAt(i))) {
  //       ans.append(str1.charAt(i));
  //     }
  //   }
  //   return ans.toString();
  // }
  static String solution(String str1, String str2){
    HashSet<Character> hs = new HashSet<>();
    StringBuilder ans = new StringBuilder("");
    for (int i = 0; i < str2.length(); i++) {
      hs.add(str2.charAt(i));
    }
    for (int i = 0; i < str1.length(); i++) {
      if (!hs.contains(str1.charAt(i))) {
        ans.append(str1.charAt(i));
      }
    }
    return ans.toString();
  }
  public static void main(String[] args) {
    String str1 = "coumputer";
    String str2 = "cat";
    System.out.println(solution(str1, str2));
  }
}