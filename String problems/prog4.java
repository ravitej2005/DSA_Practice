class prog4 {
  // static String checkPalindrome(String str){
  //   StringBuilder sb = new StringBuilder(str);
  //   int start = 0;
  //   int end = str.length()-1;
  //   while (start<end) {
  //     char tmp = sb.charAt(start);
  //     sb.setCharAt(start, sb.charAt(end));
  //     sb.setCharAt(end, tmp);
  //     start++;
  //     end--;
  //   }
  //   return sb.toString();
  // }

  // static boolean checkPalindrome(String str){
  //   String rev = "";
  //   for (int i = 0; i < str.length(); i++) {
  //     rev = str.charAt(i) + rev;
  //   }
  //   return rev.equals(str);
  // }

  static boolean checkPalindrome(String str){
    StringBuilder sb = new StringBuilder(str);
    return str.equals(sb.reverse().toString());
  }
    
  public static void main(String[] args) {
    System.out.println(checkPalindrome("madam"));
  }
}