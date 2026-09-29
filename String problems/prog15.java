// Remove extra spaces

class prog15 {
  static String solution1(String str){
    return str.trim();  // But this only removes extra spaces before and after sentence
  }

  static String solution2(String str){
    String[] words = str.split(" ");
    StringBuilder sb = new StringBuilder();
    int count = 1;
    for (int i = 0; i < words.length; i++) {
      if (words[i]!="") {
        if (count!=1) {
          sb.append(" ");
        }
        sb.append(words[i]);
        count++;
      }
    }
    return sb.toString();
  }

  static String solution3(String str){
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)==' ') {
        continue;
      }
      ans.append(str.charAt(i));
      if (i+1<str.length() && str.charAt(i+1)==' ') {
        ans.append(" ");
      }
    }
    return ans.toString();
  }

  public static void main(String[] args) {
    String str = "    The    sky    is   blue   ";
    System.out.print("Before removing extra spaces : ");
    System.out.println(str);
    System.out.println("After removing extra spaces : ");
    System.out.print("Solution1 : ");
    System.out.println(solution1(str)); // But this only removes extra spaces before and after sentence
    System.out.print("Solution2 : ");
    System.out.println(solution2(str)); // But this only removes extra spaces before and after sentence
    System.out.print("Solution3 : ");
    System.out.println(solution3(str)); 

  }
}