class prog {
  static void reverseWords(String s){
    String ans="";
    for (int i = 0; i < s.length(); i++) {
      String str = "";
      if(s.charAt(i)==' ') {
        continue;
      }
      while (i<s.length() &&  s.charAt(i)!=' ') {
        str += s.charAt(i);
        i++;
      }
      if (ans!="") str+=" ";
      ans=str+ans;
    }
    System.out.println(ans);
  } 

  public static void main(String[] args) {
    // String s = "the sky is blue";
    // String s = "   hello world   ";
    String s = "a good   example";
    reverseWords(s);
  }
}