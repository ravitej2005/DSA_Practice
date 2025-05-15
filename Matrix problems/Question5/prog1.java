class prog1 {
  static void printMatrix(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  static void matrixTranspose(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = i+1; j < mat[0].length; j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printMatrix(matrix);
    matrixTranspose(matrix);
    System.out.println();
    printMatrix(matrix);
  }
}