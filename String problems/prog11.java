class prog11 {
  // static boolean checkIfOnlyDigits(String str){
  //   for (int i = 0; i < str.length(); i++) {
  //     if (str.charAt(i)>'9' || str.charAt(i)<'0') {
  //       return false;
  //     }
  //   }
  //   return true;
  // }
  static boolean checkIfOnlyDigits(String str){
    for (int i = 0; i < str.length(); i++) {
      if ("0123456789".indexOf(str.charAt(i)) == -1) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(checkIfOnlyDigits("125694"));
    System.out.println(checkIfOnlyDigits("15aed"));
  }
}