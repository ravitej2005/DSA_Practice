class prog1 {
  static int findMaxProfit(int[] arr){
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      minPrice = Math.min(minPrice, arr[i]);
      maxProfit = Math.max(maxProfit, arr[i]-minPrice);
    }
     return maxProfit;
  }
  public static void main(String[] args) {
    // int[] arr = {7,1,5,3,6,4};
    int[] arr = {7,6,4,3,1};
   
    int profit = findMaxProfit(arr);
    System.out.println(profit);
    
  }
}