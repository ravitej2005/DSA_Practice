import java.util.HashMap;

public class Prog1 {

  // static int countSubarray(int[] arr,int k) {
  //   int count = 0;

  //   int prefixSum = 0;
  //   HashMap<Integer,Integer> hm = new HashMap<>();

  //   hm.put(0, 1);

  //   for (int i = 0; i < arr.length; i++) {
  //     prefixSum += arr[i];
  //     System.out.println("prefixSum : "+prefixSum);
      
  //     count += hm.getOrDefault(prefixSum -k, 0);
  //     System.out.println("count : "+count);
  //     hm.put(prefixSum, hm.getOrDefault(prefixSum, 0)+1);
  //     System.out.println("hm : "+hm);
  //   }

  //   return count;
  // }

  // static int longest(int[] arr,int k){
  //   HashMap<Integer, Integer> hm = new HashMap<>();
  //   int maxLen = 0;
  //   int sum = 0;
  //   hm.put(0, -1);
  //   for (int i = 0; i < arr.length; i++) {
  //     sum += arr[i];
  //     if (hm.containsKey(sum-k)) {
  //       maxLen = Math.max(maxLen, i-hm.get(sum-k));
  //     }
  //     if (!hm.containsKey(sum)) {
  //        hm.put(sum, i);
  //     }
  //   }
  //   return maxLen;

  // }

  static int maxsub(int[] arr){
    int sum = 0;
    int max =Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      
        sum += arr[i];
        max=Math.max(max, sum);
        if (sum<0) {
          sum=0 ;
        }
    }
    return max;

  }

  public static void main(String[] args) {
    // int arr[] = {2,0,0,0,0,0,3};
    // int k = 3;
    // int arr[] = {4,-1,3,-3,3};
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    int k = 3;
    // int arr[] = {2,3,5};
    // int arr[] = {2,3,5,1,9};
    // int k = 9; 
    // int arr[] = {1, 2, 3, 4, 5};
    // int arr[] = {3,2,1,4};
    // int arr[] = {3,1,2,4};

    System.out.println(maxsub(arr));
  }
}