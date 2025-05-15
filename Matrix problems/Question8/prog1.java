import java.util.HashSet;

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
    HashSet<Integer> seti = new HashSet<>();
    HashSet<Integer> setj = new HashSet<>();
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j]==0) {
          seti.add(i);
          setj.add(j);
        }
      }
    }
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (seti.contains(i)) {
          mat[i][j] = 0;
        }
        if (setj.contains(j)) {
          mat[i][j] = 0;
        }
      }
    }
  }
  public static void main(String[] args) {
    // int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
    int[][] matrix = {{1,1,1},{1,0,1},{1,1,0}};
    sortMatrix(matrix);
    printMatrix(matrix);
  }
}