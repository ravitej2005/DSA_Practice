class prog8 {
  // static String reverseString(String str){
  //   str = str+" ";
  //   String ans="";
  //   String sb = "";
  //   for (int i = 0; i < str.length(); i++) {
  //     if (str.charAt(i)!=' ') {
  //       sb = str.charAt(i)+sb;
  //     }else{
  //       ans = ans+sb+" ";
  //       sb="";
  //     }
  //   }
  //   return ans;
  // }
  static String reverseString(String str){
    String[] words = str.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      sb.append(new StringBuilder(words[i]).reverse());
      sb.append(" ");
    }
    return sb.toString();
  }
  
  public static void main(String[] args) {
    String str = "The Sky Is Blue";
    System.out.println(reverseString(str));
  }
}