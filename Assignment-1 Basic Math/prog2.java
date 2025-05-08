// Que. Check if number is palindrome or not

import java.util.Scanner;

class prog2 {
  static boolean checkPalindrome(int num){
    int reversedNum=0;
    int dummyNum = num;
    while (dummyNum!=0) {
      reversedNum = (reversedNum*10) + (dummyNum%10);
      dummyNum/=10;
    }
    return num==reversedNum ? true : false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    if (checkPalindrome(num)) {
      System.out.println(num+" is a palindrome number");
    } else{
      System.out.println(num+" is not a palindrome number");
    }
    sc.close();
  }
}