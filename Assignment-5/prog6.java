class prog6 {
  // static int solution(int[][] mat, int i, int j, int ans){
  //   int k = j;
  //   while (k < mat[0].length) {
  //     if (mat[i][k] < ans) {
  //       ans = mat[i][k];
  //       ans = solution(mat, i, k, ans);
  //       j = k;
  //       break;
  //     }
  //     k++;
  //   }

  //   // k = i;
  //   // while (k<mat.length) {
  //   //   if (mat[k][j]>ans) {
  //   //     ans = mat[k][j];
  //   //     ans = solution(mat, k, j, ans);
  //   //     i = k;
  //   //     break;
  //   //   }
  //   //   k++;
  //   // }
  //   k = i;
  //   for (int k2 = 0; k2 < mat.length; k2++) {
      
  //   }
  //   return ans;
  // }

  static boolean isMaxFromCol(int[][] mat, int i, int j){
    boolean isMax = true;
    int k = 0;
    while (k<mat.length) {
      if (mat[k][j]>mat[i][j]) {
        isMax = false;
        break;
      }
      k++;
    }
    return isMax;
  }

  static int solution(int[][] mat){
    int ans = 0;
    int min_i = 0;
    int min_j = 0;
    
    for (int i = 0; i < mat.length; i++) {
      int min = Integer.MAX_VALUE;
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j]<min) {
          min = mat[i][j];
          min_i = i;
          min_j = j;
        }
      }
      if(isMaxFromCol(mat, min_i, min_j)){
        ans = mat[min_i][min_j];
        break;
      }
    }

    
    return ans;
  }
  public static void main(String[] args) {
    // int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
    int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
    // int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,2,17,12}};
    // int[][] matrix = {{7,8},{1,2}};
    // System.out.println(solution(matrix, 0, 0, matrix[0][0]));
    System.out.println(solution(matrix));
  }
}