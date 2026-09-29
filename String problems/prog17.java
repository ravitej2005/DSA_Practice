// String str = "abccbadaccad";
// 3 straight 3 reverse 3 straight 3 reverse.... check if such patten exists

class prog17 {
  static boolean solution1(String str){
    int a = 6;
    if (str.length()%6!=0) {
      return false;
    }

    StringBuilder sb;
    StringBuilder rev;
    int i = 0;

    while (a<=str.length()) {
      i = a-6;
      sb = new StringBuilder(str.substring(i, i+3));
      rev = new StringBuilder(str.substring(i+3, a));
      if (!sb.toString().equals(rev.reverse().toString())) {
        return false;
      }
      a += 6;
    }
    return true;
  }

  static boolean solution2(String str){
    if (str.length()%6!=0) {
      return false;
    }
    for (int i = 0; i < str.length(); i+=6) {
      if (!isPalindrome(str.substring(i, i+6))) {
        return false;
      } 
    }
    return true;
  }

  static boolean isPalindrome(String str){
    System.out.println(str);
    for (int i = 0; i < str.length()/2; i++) {
      if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "abccbadaccad";
    // String str = "abccb";
    System.out.println(solution2(str));
  }
}