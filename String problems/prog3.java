class prog3 {
  static boolean checkPalindrome(String str){
    boolean isPalindrome = true;
    int start = 0;
    int end = str.length()-1;
    while (start<end) {
      if (str.charAt(start)!=str.charAt(end)) {
        isPalindrome = false;
        break;
      }
      start++;
      end--;
    }
    return isPalindrome;
  }
  public static void main(String[] args) {
    System.out.println(checkPalindrome("maddam"));
  }
}