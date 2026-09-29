package Subsequence;

public class prog6 {
  
  // public static void generateValidParaString(String str, String para, int counter , int ind, int n){
  //   str += para;
  //   if (para == "(") counter++;
  //   else if (para == ")") counter--;
    
  //   if (counter<0 || counter>n) return;
  //   if (ind == (n*2)-1) {
  //     if (counter == 0) {
  //       System.out.println(str);
  //     }
  //     return;
  //   }

  //   generateValidParaString(str, "(", counter, ind+1, n);
  //   generateValidParaString(str, ")", counter, ind+1, n);
  // }
  public static void generateValidParaString(String str, String para, int ind, int n, int open , int close){
    str += para;
    if (ind==(n*2)-1) {
      System.out.println(str);
      return;
    }
    if (open<n) {
      // System.out.println(str);
      generateValidParaString(str, "(", ind+1, n, open+1, close);
    } 
    if (close<open) {
      // System.out.println(str);
      generateValidParaString(str, ")", ind+1, n, open, close+1);
    }
  }
  public static void main(String[] args) {
    int n = 3;
    generateValidParaString("", "", -1, n,0,0);
  }
}
