//Product of digits in a number
import java.util.Scanner;

class prog3 {
  static int findProductOfDigits(int num){
    if (num==0) return 1;
    return num%10 * findProductOfDigits(num/10);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    int product = findProductOfDigits(num);
    System.out.println(product);
    sc.close();
  }
}