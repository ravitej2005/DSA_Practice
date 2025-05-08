import java.util.Scanner;

class prog4 {
  static boolean checkArmstrong(int num){
    int count = 0;
    int dummyNum = num;
    int armstrongNum = 0;
    while (dummyNum!=0) {
      dummyNum/=10;
      count++;
    }
    dummyNum = num;
    while (dummyNum!=0) {
      int digit = dummyNum%10;
      armstrongNum += Math.pow(digit, count);
      dummyNum /= 10;
    }
    return armstrongNum == num ? true : false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    boolean isArmstrong = checkArmstrong(num);
    if (isArmstrong) {
      System.out.println(num+" is an armstrong number");
    } else{
      System.out.println(num+" is not an armstrong number");
    }
    sc.close();
  }
}