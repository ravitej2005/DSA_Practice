//Factorial N->1 approach 
import java.util.Scanner;

class prog3 {
  static int factorial(int num){
    if (num==1) return 1;
    return num*factorial(num-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    int factorial = factorial(num);
    System.out.println("Factorial of "+num+" is : "+factorial);
    sc.close();
  }
}