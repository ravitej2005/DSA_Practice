//Count of digits in a number
import java.util.Scanner;

class prog3 {
  static int count = 0;
  static void findCountOfDigits(int num){
    if (num!=0) {
      count++;
      findCountOfDigits(num/10);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    findCountOfDigits(num);
    System.out.println(count);
    sc.close();
  }
}