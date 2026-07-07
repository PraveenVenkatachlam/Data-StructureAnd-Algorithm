//! Maximum Average Subarray I
// Time Complexity: O(n)
//  Space Complexity: O(1)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        // int max=0;
         int window_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=nums[i];
        }
         int max=  window_sum;
        for(int j=k;j<nums.length;j++){
            //  int currSum = 0;
             window_sum += nums[j] - nums[j - k];
             max = Math.max(max, window_sum);
        }
        // return max;
        return (double) max / k;
    }
}