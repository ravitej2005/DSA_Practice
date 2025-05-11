import java.util.Arrays;

class prog1 {
  static int findNum(int[] arr){
    Arrays.sort(arr);
    int i = 0;
    while (i<arr.length) {
      int count=0;
      int num = arr[i];
      while (i<arr.length&&num==arr[i]) {
        i++;
        count++;
      }
      if (count>arr.length/2) {
        return num;
      }
    }
    return -1; 
  }
  public static void main(String[] args) {
    // int[] arr = {2,2,1,1,1,2,2};
    // int[] arr = {4,4,2,4,3,4,4,3,2,4};
    int[] arr = {3,2,3};
   
    int num = findNum(arr);
      System.out.println(num);
    
  }
}