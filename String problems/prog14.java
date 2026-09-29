// Count number of words

class prog14 {
  static int countWords1(String str){    //Solution1
    String[] words = str.split(" ");
    return words.length;
  }

  static int countWords2(String str){    //Solution1
    int spaces = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)==' ') {
        spaces++;
      }
    }
    return spaces+1;
  }

  public static void main(String[] args) {
    String str = "The sky is blue";
    System.out.println(countWords1(str));
    System.out.println(countWords2(str));
  }
}