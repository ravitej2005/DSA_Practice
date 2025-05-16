class prog1 {
  static boolean checkElement(int[][] mat, int N, int M, int target) {
    int rLow = 0;
    int rHigh = M - 1;
    int row = -1;
    while (rLow <= rHigh) {
      int rMid = (rLow + rHigh) / 2;
      if (mat[rMid][0] > target) {
        rHigh = rMid - 1;
      } else if (mat[rMid][M - 1] < target) {
        rLow = rMid + 1;
      } else {
        row = rMid;
        break;
      }
    }
    if (row == -1) {
      return false;
    }
    int cLow = 0;
    int cHigh = M - 1;
    while (cLow <= cHigh) {
      int cMid = (cLow + cHigh) / 2;
      if (mat[row][cMid] == target) {
        return true;
      } else if (mat[row][cMid] > target) {
        cHigh = cMid - 1;
      } else {
        cLow = cMid + 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
    // 14, 15, 16 } };
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