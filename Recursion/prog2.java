// Que. Given an integer N, print from N to 1 using recursion
import java.util.Scanner;

class prog2 {
  static void printNumber(int num){
    if (num>=1) {
      System.out.println(num--);
      printNumber(num);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    printNumber(num);
    sc.close();
  }
}