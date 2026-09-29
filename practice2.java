public class practice2 {
  public static void maximumValidParenthesis(String str){
    int max = 0;
    int counter1 = 0;
    int counter2 = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)=='(') {
        counter1++;
      } else {
        counter2--;
        if (counter1>0) {
          max = Math.max(max, counter2*(-2));
          counter1--;
        } else{
          counter2=0;
        }
      }
    }
    System.out.println(max);
  }
  public static void main(String[] args) {
    String str = "(()";
    maximumValidParenthesis(str);
  }  
}
