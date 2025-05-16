class prog2 {
  static boolean checkRotatedString(String s,String goal){
    s = s+s;
    return s.contains(goal) ? true : false;
  } 

  public static void main(String[] args) {
    String s = "abcde";
    String  goal= "cdeab";
    // String s = "abcde";
    // String  goal= "abced";
    
    System.out.println(checkRotatedString(s,goal));
  }
}