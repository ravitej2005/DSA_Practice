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
    int col = -1;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j]==0) {
          if(i==0){
            col = 0;
          }else{
            mat[0][j] = 0;
            mat[i][0] = 0;
          }
        }
      }
    }
    for (int i = 1; i < mat.length; i++) {
      for (int j = 1; j < mat[0].length; j++) {
        if (mat[0][j]==0 || mat[i][0]==0) {
          mat[i][j] = 0;
        }
      }
    }

    if (mat[0][0]==0) {
      for (int i = 0; i < mat.length; i++) {
        mat[i][0] = 0;
      }
    }

    if (col==0) {
      for (int i = 0; i < mat.length; i++) {
        mat[0][i] = 0;
      }
    }
  }

  public static void main(String[] args) {
    // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    // int[][] matrix = {{1,1,1},{1,0,1},{1,1,0}};
    // int[][] matrix = {{1,1,1},{1,1,1},{1,1,0}};
    // int[][] matrix = {{1,1,1},{0,1,1},{1,1,1}};
    int[][] matrix = {{1,0,1},{1,1,1},{0,1,1}};
    sortMatrix(matrix);
    printMatrix(matrix);
  }
}