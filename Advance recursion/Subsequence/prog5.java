package Subsequence;

public class prog5 {
  public static void generateSubsequence(String str, String newStr, int ind){
    if (ind == str.length()) {
      System.out.println(newStr);
      return;
    }
    generateSubsequence(str, newStr+str.charAt(ind), ind+1);
    generateSubsequence(str, newStr, ind+1);
  }
  public static void main(String[] args) {
    String str = "abc";
    generateSubsequence(str, "", 0);
  }
}
