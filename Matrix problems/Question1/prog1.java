class prog1 {
  static void printMatrix(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j]+" ");
      }
    }
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    printMatrix(matrix);
  }
}