//! 3903 
class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;
        // int max = nums[0];
        // int min = nums[j];
        // if(n>0||n!=[]){

        // }

        for (int i = 0; i < n; i++) {

            int max = nums[0];
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }
            int min=nums[i];
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }
            if (max - min <= k) {
                return i;
            }

        }
        // for(int i=0;i<nums.length;i++){
        //     int currentmax=max-nums[0];
        //     max=Math.max(i,i+1);
        // }
        //  prefixMax[i] - suffixMin[i] <= k

        // for(int i=0;i<nums.length;i++){
        //     if(max-min && min<=k ){
        //         return i;
        //     }
        // }

        return -1;
    }
}


//! O(n) Code
class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        // 🔹 Step 1: Build suffixMin array
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // 🔹 Step 2: Traverse and track max
        int maxSoFar = nums[0];

        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);

            if (maxSoFar - suffixMin[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}