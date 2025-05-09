import java.util.HashSet;

class prog2 {
  static int sortArray(int[] arr){
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      hashSet.add(arr[i]);
    }
    int i = 0;
    for (int num : hashSet) {
      arr[i++] = num;
    }
    System.out.println(hashSet);
    return hashSet.size();
  }


  public static void main(String[] args) {
    // int[] arr = {1,2,2,3,1,4};
    int[] arr = {5,5,5,7,7,9};
    // int[] arr = {5,8,2,7,1,9};
    // int[] arr = {4,5,1,2,4};
    // int[] arr = {10,20,10,30,40};
    int distinctElemenetsCount = sortArray(arr);
    System.out.println(distinctElemenetsCount );
    
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]+" ");
    }
  }
}