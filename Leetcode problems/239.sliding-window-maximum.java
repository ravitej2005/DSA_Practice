/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - (k - 1)];
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        dq.push(j);
        j++;
        while (i <= nums.length-k) {
            if (j < k) {
                while (dq.peekLast()!=null && nums[j] > nums[dq.peekLast()]) {
                    dq.removeLast();
                }
                dq.addLast(j);
                j++;
            } else {
                while (dq.peek()<i) {
                    dq.removeFirst();
                }
                ans[i] = nums[dq.peek()];
                
                while (j<nums.length && dq.peekLast()!=null && nums[j] > nums[dq.peekLast()]) {
                    dq.removeLast();
                }
                dq.addLast(j);
                j++;
                i++;
            }
        }
        return ans;
    }
}
// @lc code=end
