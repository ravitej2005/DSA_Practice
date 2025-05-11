//Wrong approach❌❌

// public class Prog2 {

//   static int buyAndSell(int[] arr){
//     int profit = 0;
//     int min = 0;
//     int max = arr.length -1;

//     while (min<max) {
//       while (min<max && arr[min]> arr[min + 1]) {
//         min++;
//       }
//       while (min<max && arr[max]< arr[max - 1]) {
//        max--;
//       }

//       if (arr[max] - arr[min] > profit) {
//         profit = arr[max] - arr[min];
//       }
//       max--;
//     }

//     if (profit < 0) {
//       return 0;
//     }

//     return profit;
//   }
//   public static void main(String[] args) {
//     // int arr[] = {1,2,3,4,5,6,7,8,9,100};
//     int arr[] = {3,6,1,7};
//     // int arr[] = {9,8,7,1,2};
//     // int arr[] = {5,5,5,5,5};
//     // int arr[] = {10};
//     // int arr[] = {};
//     // int arr[] = {5};
//     // int arr[] = {7,6,5,4,3};
//     // int arr[] = {1,2,3,4,5};
//     // int arr[] = {3,2,6,1,3};
//     // int arr[] = {2,4,1};
//     // int arr[] = {4,6,1,2};
//     // int arr[] = {7,1,5,3,6,4};

//     System.out.println(buyAndSell(arr));
//   }
// }
