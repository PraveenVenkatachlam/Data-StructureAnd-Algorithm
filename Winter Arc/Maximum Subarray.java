//! 53. Maximum Subarray
//?TC:O(N)
//?SC:O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubarray = nums[0];
        int sum = nums[0];
        for (int i=1;i<nums.length;i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSubarray = Math.max(sum, maxSubarray);
        }
        return maxSubarray;
    }
}