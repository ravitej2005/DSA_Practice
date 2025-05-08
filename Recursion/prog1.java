// Que. Given an integer N, print from 1 to N using recursion
import java.util.Scanner;

class prog1 {
  static void printNumber(int counter , int num){
    if (counter<=num) {
      System.out.println(counter++);
      printNumber(counter,num);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    printNumber(1,num);
    sc.close();
  }
}