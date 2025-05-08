//Counting digits in a number
import java.util.Scanner;

class prog {
  static int countDigits(int num) {
    int counter = 0;
    while (num != 0) {
      num /= 10;
      counter++;
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    int digits = countDigits(num);
    System.out.println(digits);
    sc.close();
  }
}