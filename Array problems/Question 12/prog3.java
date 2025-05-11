//Boyer & Moore's Algorithm

class prog3 {
  static int findNum(int[] arr){
    int candidate=-1;
    int votes = 0;
    for (int i = 0; i < arr.length; i++) {
      if (votes==0) {
        candidate = arr[i];
      }
      if (arr[i]==candidate) {
        votes++;
      }else{
        votes--;
      }
    }
    return candidate;
  }
  public static void main(String[] args) {
    int[] arr = {2,2,1,1,1,2,2};
    // int[] arr = {4,4,2,4,3,4,4,3,2,4};
    // int[] arr = {3,2,3};
   
    int num = findNum(arr);
      System.out.println(num);
    
  }
}