//Sum of digits in a number
import java.util.Scanner;

class prog2 {
  static int findSumOfDigits(int num){
    if (num==0) return 0;
    return num%10 + findSumOfDigits(num/10);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    int sum = findSumOfDigits(num);
    System.out.println(sum);
    sc.close();
  }
}