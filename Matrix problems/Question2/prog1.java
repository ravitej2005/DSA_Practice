class prog1 {
  static void printMatrix(int[][] mat){
    for (int i = mat.length-1; i >= 0; i--) {
      for (int j = mat[0].length-1; j >= 0; j--) {
        System.out.print(mat[i][j]+" ");
      }
    }
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    printMatrix(matrix);
  }
}