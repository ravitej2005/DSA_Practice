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
    int[] cols = new int[mat[0].length];
    int[] rows = new int[mat.length];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j]==0) {
          cols[j] = 1;
          rows[i] = 1;
        }
      }
    }
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (rows[i]==1) {
          mat[i][j] = 0;
        }
        if (cols[j]==1) {
          mat[i][j] = 0;
        }
      }
    }
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    // int[][] matrix = {{1,1,1},{1,0,1},{1,1,0}};
    sortMatrix(matrix);
    printMatrix(matrix);
  }
}