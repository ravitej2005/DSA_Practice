class prog {
  static void reverseWords(String s){
    String[] arr = s.split(" ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("("+arr[i]+")");
    }
    String ans = "";
    for (int i = arr.length-1; i >= 0; i--) {
      if (arr[i]!="") {
        ans+=(arr[i]+" ");
      }
    }
    System.out.println(ans.substring(0, ans.length()-1));
  } 

  public static void main(String[] args) {
    String s = "the sky is blue";
    // String s = "   hello world   ";
    // String s = "a good   example";
    reverseWords(s);
  }
}