class prog2 {
  static void countDigits(String str){
    int digits = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9)  digits++; 
    }
    System.out.println(digits);
  }
  public static void main(String[] args) {
    String str = "ab09cd89efg";
    countDigits(str);
  }
}