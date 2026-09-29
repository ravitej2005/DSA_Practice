class prog20 {
  static String fancyString(String str){
    int counter = 1;
    StringBuilder sb = new StringBuilder(str.charAt(0)+"");
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i)==str.charAt(i-1)) {
        counter++;
      }else{
        counter = 1;
      }
      if (counter<3) {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String str = "aaabaaaa";
    // String str = "leeetcode";
    System.out.println(fancyString(str));
  }
}