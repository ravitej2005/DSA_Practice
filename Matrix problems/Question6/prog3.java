class prog1 {
  static void printMatrix(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
  }

  static void transpose(int[][] mat){
    for (int i = 0; i < mat.length; i++) {
      for (int j = i+1; j < mat.length; j++) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }
  }

  static void sortMatrix(int[][] mat){
      int start = 0;
      int end = mat.length-1;
      while (start<end) {
        int[] temp = mat[start];
        mat[start] = mat[end];
        mat[end] = temp;
        start++;
        end--;
      }
    
    transpose(mat);
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println("Before sort : ");
    printMatrix(matrix);
    sortMatrix(matrix);
    System.out.println("\nAfter sort : ");
    printMatrix(matrix);
  }
}