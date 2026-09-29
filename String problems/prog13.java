//Find most frequent character

class prog13 {
  static Character solution(String str){
    int[] arr = new int[26];
    int max = 0;
    int max_i = 0;
    for (int i = 0; i < str.length(); i++) {
      arr[str.charAt(i)-'a']++;     //Frequency array
      if (max < arr[str.charAt(i)-'a']) {
        max = arr[str.charAt(i)-'a'];
        max_i = str.charAt(i)-'a';
      }
    }
    return (char) ('a'+max_i);
  }

  public static void main(String[] args) {
    System.out.println(solution("apple"));
  }
}