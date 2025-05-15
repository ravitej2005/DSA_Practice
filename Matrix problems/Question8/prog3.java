class prog1 {
  static void printMatrix(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }

  static void sortMatrix(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j]==0) {
          int col = 0;
          while (col<mat[0].length) {
            if(mat[i][col]!=0){
              mat[i][col] = -1;
            }
            col++;
          }
          int row = 0;
          while (row<mat.length) {
            if (mat[row][j]!=0) {
              mat[row][j] = -1;
            }
            row++;
          }
        }
      }
    }
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j]==-1) {
          mat[i][j] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    // int[][] matrix = {{1,1,1},{1,0,1},{1,1,0}};
    int[][] matrix = {{1,1,1},{1,1,1},{1,1,0}};
    sortMatrix(matrix);
    printMatrix(matrix);
  }
}