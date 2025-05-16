class prog {
  static boolean checkRotatedString(String s,String goal){
    if (s.length()!=goal.length()) {
      return false;
    }
    int diff = -1;
    int i = 0;
    int j = goal.length()-1;
    while (i<=j) {
      if (goal.charAt(i)==s.charAt(0)) {
        diff = i;
        break;
      }
      if (goal.charAt(j)==s.charAt(0)) {
        diff = j;
        break;
      }
      i++;
      j--;
    }
    for (int k = 0; k < s.length(); k++) {
      if (s.charAt(k)!=goal.charAt((k+diff)%s.length())) {
        return false;
      }
    }
    return true;
  } 

  public static void main(String[] args) {
    // String s = "abcde";
    // String  goal= "cdeab";
    String s = "abcde";
    String  goal= "abced";
    
    System.out.println(checkRotatedString(s,goal));
  }
}