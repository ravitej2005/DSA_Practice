// i = start column index
// j = end column index
// k = start row index
// l = end row index
// dir = direction

class prog1 {
  static void printMatrixPattern(int[][] mat){
    int i = 0;
    int j = mat[0].length-1;
    int k = 0;
    int l = mat.length-1;
    int dir = 0;
    while (i<=j||k<=l) {
      if (dir%4==0) {
        int n = i;
        while (n<=j) {
          System.out.print(mat[k][n]+" ");
          n++;
        }
        k++;
        dir++;
      } else if (dir%4==1) {
        int n = k;
        while (n<=l) {
          System.out.print(mat[n][j]+" ");
          n++;
        }
        j--;
        dir++;
      } else if (dir%4==2) {
        int n = j;
        while (n>=i) {
          System.out.print(mat[l][n]+" ");
          n--;
        }
        l--;
        dir++;
      } else{
        int n = l;
        while (n>=k) {
          System.out.print(mat[n][i]+" ");
          n--;
        }
        i++;
        dir++;
      }
    }
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    printMatrixPattern(matrix);
  }
}