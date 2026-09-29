class prog7 {
  static boolean charAnagram(String str1, String str2){
    int a = 0;
    for (int i = 0; i < str1.length(); i++) {
      a ^= str1.charAt(i);
    }
    for (int i = 0; i < str2.length(); i++) {
      a ^= str2.charAt(i);
    }
    return a==0 ? true : false;
  }
  public static void main(String[] args) {
    System.out.println(charAnagram("apple","papel"));
  }
}