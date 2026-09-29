class prog {
  static int solution(int[][] mat){
    int i = 0;
    int j = mat.length-1;
    int sum = 0;
    while (i<=j) {
      if (i==j) {
        sum += mat[i][j];
      }else{
        sum +=  mat[i][j] + mat[j][i] + mat[i][i] + mat[j][j];
      }
      i++;
      j--;
    }
    return sum;
  }
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    // int[][] matrix = {{5}};
    // int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    System.out.println(solution(matrix));
  }
}