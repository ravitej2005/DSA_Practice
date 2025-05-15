class prog1 {
  static void printMatrix(int[][] mat){
    for (int i = 0; i < mat[0].length; i++) {
      for (int j = mat.length-1; j >=0; j--) {
        System.out.print(mat[j][i]+" ");
      }
    }
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    printMatrix(matrix);
  }
}