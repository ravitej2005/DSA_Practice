//Factorial 1->N approach 
import java.util.Scanner;

class prog4 {
  static int factorial(int counter, int num){
    if (counter==num) return counter;
    return (counter++)*factorial(counter,num);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    int factorial = factorial(1,num);
    System.out.println("Factorial of "+num+" is : "+factorial);
    sc.close();
  }
}