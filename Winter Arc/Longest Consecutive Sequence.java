//! 128. Longest Consecutive Sequence
Time: O(n log n)
Space: O(log n)
class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int count =0;
        // for(int num:nums){
        //     if(num[i]>num(i+1)){
        //         count ++;
        //     }
        // }
        // return count;
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=1, maxCount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                count++;
            }else{
                count=1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
//optimal
//TC:O(N)
//SC:O(N)
class Solution {
    public int longestConsecutive(int[] nums) {      
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            numSet.add(i);
        }

        int longest = 0;

        for (int j : numSet) {
            if (!numSet.contains(j - 1)) {
                int currentNum = j;
                int currentStreak = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                longest = Math.max(longest, currentStreak);
            }
        }
        
        return longest;
    }
}