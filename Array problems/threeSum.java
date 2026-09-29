import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class prog {
  public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<nums.length;i++){
            int j = 0;
            int k = n-1;
            while(j<k){
                if(j==i) {
                    j++;
                    continue;
                }
                if(k==i) {
                    k--;
                    continue;
                }
                if(nums[i]+nums[j]+nums[k] > 0) k--;
                else if(nums[i]+nums[j]+nums[k] < 0) j++;
                else {
                    ls.add(List.of(nums[i],nums[j],nums[k]));
                    k--;
                    j++;
                    while(k>j && nums[k]==nums[k+1]){
                        k--;
                    }
                    while(j<k && nums[j]==nums[j-1]){ 
                        j++;
                    }
                }
            }
        }
        return ls;
    }

  public static void main(String[] args) {
    List<List<Integer>> ls = threeSum(new int[]{-1,0,1,2,-1,-4});
    for (List<Integer> lst : ls) {
      System.out.print("[ ");
        for (int e : lst) {
          System.out.print(e+" ");
        }
      System.out.print("]");
    }
  }
}