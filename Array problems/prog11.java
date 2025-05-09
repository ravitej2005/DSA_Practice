class prog11 {
  static int getAbsentNumber(int[] arr, int n){
    int sum = (n*(n+1))/2;
    int sumOfArr = 0;
    for (int i = 0; i < arr.length; i++) {
      sumOfArr += arr[i];
    }
    return sum-sumOfArr;
  }
  public static void main(String[] args) {
    // int n = 5;
    // int[] arr = {1,2,4,5};
    int n = 3;
    int[] arr = {1,3};
    int num = getAbsentNumber(arr, n);
    System.out.println(num);
  }
}