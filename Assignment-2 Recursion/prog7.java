import java.util.Scanner;

class prog7 {
  static boolean checkPrime(int num, int i){
    boolean isPrime = true;
    if (i==num) return isPrime;
    if (num%i==0) return isPrime = false;
    return isPrime = checkPrime(num, ++i);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    boolean isPrime = checkPrime(num, 2);
    System.out.println(isPrime);
    sc.close();
  }
}