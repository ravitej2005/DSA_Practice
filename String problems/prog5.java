class prog5 {
  static String changeCases(String mystr){
    StringBuilder ans = new StringBuilder("");
    for (int i = 0; i < mystr.length(); i++) {
      if (Character.isLowerCase(mystr.charAt(i))) {
        ans.append(Character.toUpperCase(mystr.charAt(i)));
      }else{
        ans.append(Character.toLowerCase(mystr.charAt(i)));
      }
    }
    return ans.toString();
  }
  public static void main(String[] args) {
    String str = "AbCdE";
    System.out.println(changeCases(str));
  }
}