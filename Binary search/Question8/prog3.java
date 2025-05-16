class prog1 {
  static boolean checkElement(int[][] mat, int N, int M, int target) {
    int s = 0;
    int e = (M * N)-1;

    while (s <= e) {
      int mid = (s + e) / 2;
      int row = mid / M;
      int col = mid % M;

      if (mat[row][col] == target) {
        return true;
      } else if (mat[row][col] > target) {
        e = mid - 1;
      } else {
        s = mid + 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    // int N = 3;
    // int M = 4;
    // int target = 8;
    int[][] matrix = { { 1, 2, 4 }, { 6, 7, 8 }, { 9, 10, 34 } };
    int N = 3;
    int M = 3;
    int target = 0;
    System.out.println(checkElement(matrix, N, M, target));
  }
}