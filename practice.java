class practice {
  public static void main(String[] args) {
    String str = "))((";
    int counter=0;
    int close=0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)=='(') {
        counter++;
      }else {
        counter--;  
      }
      if (counter<0) {
        close++;
        counter++;
      }
    }
    System.out.println(close+counter);
  }
}