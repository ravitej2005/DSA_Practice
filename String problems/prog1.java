class prog1 {
  static void countVowels(String str){
    String myStr = "aeiouAEIOU";
    int vowels = 0;
    int consonants = 0;

    for (int i = 0; i < str.length(); i++) {
      if (myStr.contains(""+str.charAt(i)+""))  vowels++; 
      else consonants++;
    }
    System.out.println(vowels);
    System.out.println(consonants);
  }
  public static void main(String[] args) {
    String str = "abcdefg";
    countVowels(str);
  }
}