class prog1 {
  static void printMatrix(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }
  static int[][] sortMatrix(int[][] mat){
    int[][] temp = new int[mat.length][mat[0].length];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        temp[i][j] = mat[(mat[0].length-1)-j][i];
      }
    }
    return temp;
  }
  public static void main(String[] args) {
    // int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    // printMatrix(matrix);
    int[][] sortedMatrix = sortMatrix(matrix);
    // System.out.println();
    printMatrix(sortedMatrix);
  }
}