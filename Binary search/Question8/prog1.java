class prog1 {
  static boolean checkElement(int[][] mat, int N, int M, int target) {
    int i = 0;
    while (i < N) {
      if (mat[i][0] <= target && target <= mat[i][M - 1]) {
        System.out.println(i);
        break;
      }
      i++;
    }
    if (i==N) {
      return false;
    }
    int low = 0;
    int high = M - 1;
    while (low <= high) {
      int mid = high + (low - high) / 2;
      System.out.println(i+" "+mid);
      if (mat[i][mid] == target) {
        return true;
      } else if (mat[i][mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    // int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int N = 3;
    // int M = 4;
    // int target = 8;
    int[][] matrix = { { 1, 2, 4 }, { 6, 7, 8 }, { 9, 10, 34 } };
    int N = 3;
    int M = 3;
    int target = 78;
    System.out.println(checkElement(matrix, N, M, target));
  }
}