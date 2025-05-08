import java.util.Scanner;

class prog3 {
  static int findGCD(int num1, int num2){
    while (num1!=0 && num2!=0) {
      if (num1 > num2) num1 = num1-num2;
      else num2 = num2-num1;
    }
    if (num1 == 0) return num2;
    else return num1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num1 : ");
    int num1 = sc.nextInt();
    System.out.print("Enter num2 : ");
    int num2 = sc.nextInt();
    int GCD = findGCD(num1, num2);
    System.out.println("GCD of "+num1+" & "+num2+" is : "+GCD);
    sc.close();
  }
}