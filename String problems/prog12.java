//Capitalise first letter of each word and return string

class prog12 {
  // static String solution(String str){ 
  //   StringBuilder sb = new StringBuilder(" "+str);
  //   StringBuilder ans = new StringBuilder();
  //   for (int i = 0; i < sb.length(); i++) {
  //     if (i==0) {
  //       continue;
  //     }
  //     if (sb.charAt(i-1)==' ') {
  //       // ans.append((sb.charAt(i)-('a'-'A')));
  //       ans.append((Character.toUpperCase(sb.charAt(i))));
  //     }else{
  //       ans.append((sb.charAt(i)));
  //     }
  //   }
  //   return ans.toString();
  // }

  static String solution(String str){
    String[] words = str.split(" ");
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      ans.append(Character.toUpperCase(words[i].charAt(0)));
      ans.append(words[i].substring(1));
      if(i != (words.length-1))  ans.append(" ");
    }
    return ans.toString();
  }

  public static void main(String[] args) {
    String str = "the sky is blue";
    System.out.println(solution(str));
  }
}