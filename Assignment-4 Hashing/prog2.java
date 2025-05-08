class prog2 {
  static int[] getHashedArray(int[] arr){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>=max) {
        max = arr[i];
      }
    }
    int[] hashArray = new int[max+1];
    for (int i = 0; i < arr.length; i++) {
      hashArray[arr[i]]++;
    }
    return hashArray;
  }
  
    static void printHashedArray(int[] hashArray, int[] arr){
      for (int i = 0; i < hashArray.length; i++) {
        if (hashArray[i] != 0) {
          System.out.println(i+" : "+hashArray[i]);
        }
      }
    }

  static int getFirstUniqueElement(int[] hashArray, int[] arr){
    int i;
    for (i = 0; i < arr.length; i++) {
      if (hashArray[arr[i]]==1) {
        break;
      }
    }
    return arr[i];
  }

  public static void main(String[] args) {
    // int[] arr = {1,2,2,3,1,4};
    // int[] arr = {5,5,5,7,7,9};
    int[] arr = {4,5,1,2,4};
    // int[] arr = {10,20,10,30,40};
    int[] hashArray = getHashedArray(arr);
    printHashedArray(hashArray, arr);
    int firstUniqueElement = getFirstUniqueElement(hashArray, arr);
    System.out.println("First Non repeating Element : "+firstUniqueElement);
  }
}