import java.util.Scanner;

class prog4 {
  static void printDivisors(int num){
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num%i==0) {
        if (i != (num/i)) {
          System.out.print(i+" "+(num/i)+" ");
        } else {
          System.out.print(i+" ");
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    printDivisors(num);
    sc.close();
  }
}