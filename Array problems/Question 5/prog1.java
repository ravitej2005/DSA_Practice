import java.util.Scanner;

class prog1 {
  static int findNum(int[] arr, int num){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]==num) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    // int[] arr={1,2,3,4,5};
    int[] arr={5,4,3,2,1};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();
    int numIndex = findNum(arr, num);
    System.out.println(numIndex);
    sc.close();
  }
}