import java.util.ArrayList;

class prog10 {
  static ArrayList<Integer> findUnion(int[] arr1, int[] arr2){
    System.out.println("in function");

    ArrayList<Integer> union = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i<arr1.length && j<arr2.length) {
      if (arr1[i]<=arr2[j]) {
        if (union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
          union.add(arr1[i]);
        }
        i++;
      } else {
        if (union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
          union.add(arr2[j]);
        }
        j++;
      }
    }
    while (j<arr2.length) {
      if (union.get(union.size()-1)!=arr2[j]) {
        union.add(arr2[j]);
      }
      j++;
    }
    while (i<arr1.length) {
      if (union.get(union.size()-1)!=arr1[i]) {
        union.add(arr1[i]);
      }
      i++;
    }
    System.out.println("end function");

    return union;
  }
  public static void main(String[] args) {
    System.out.println("In main");
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {2,3,4,4,5};
    ArrayList<Integer> union = findUnion(arr1, arr2);
    System.out.println("after function");
    System.out.println(union);
  }
}