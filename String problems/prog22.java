// Insert spaces

import java.util.Arrays;

class prog22 {
  static String solution(String str, int[] spaces){
    StringBuilder sb = new StringBuilder();
    Arrays.sort(spaces);
    int j = 0;
    for (int i = 0; i < str.length(); i++) {
      if (j<spaces.length && i==spaces[j]) {
        sb.append(" ");
        j++;
      }
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String str = "LeetcodeHelpsMeLearn";
    int[] spaces = {8,13,15};
    System.out.println(solution(str, spaces));
  }
}