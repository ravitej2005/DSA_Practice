import java.util.ArrayList;

class prog1 {
  static void sortArray(int[] arr1, int[] arr2, ArrayList<Integer> union) {

    int i = 0;
    int j = 0;
    while (i < arr1.length || j < arr2.length) {
      int min = -1;
      if (i < arr1.length && j < arr2.length) {
        if (arr1[i] <= arr2[j]) {
          min = arr1[i];
        } else {
          min = arr2[j];
        }
      } else if (i<arr1.length) {
        min = arr1[i];
      } else {
        min = arr2[j];
      }

      union.add(min);
      while (i < arr1.length && arr1[i] == min) {
        i++;
      }
      while (j < arr2.length && arr2[j] == min) {
        j++;
      }
    }

  }

  public static void main(String[] args) {
    ArrayList<Integer> union = new ArrayList<>();
    // int[] arr1 = {1,2,3,4,5};
    // int[] arr2 = {2,3,4,4,5};
    // int[] arr1 = {1,2,3,4,5};
    // int[] arr2 = {2,4,5,7,7,7,8,8};
    // int[] arr1 = { 1, 2, 3, 4, 5 };
    // int[] arr2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
    // int[] arr1 = { 0,0,0,0,0,0,0,0 };
    // int[] arr2 = { 1, 2, 3, 4, 5 };
    int[] arr1 = { 1,2,5,13,21 };
    int[] arr2 = { 17,20 };
    sortArray(arr1, arr2, union);
    System.out.println(union);
  }
}