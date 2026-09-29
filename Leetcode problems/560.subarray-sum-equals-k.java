/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int sum = 0;
        int j = 0;
        while ( j <= nums.length) {
            if (j<nums.length && sum<k) {
                sum += nums[j];
                j++;
            } else if(i<nums.length){
                if (sum==k) {
                    count++;
                }
                sum -= nums[i];
                i++;   
            }
        }
        return count;
    }
}
// @lc code=end

