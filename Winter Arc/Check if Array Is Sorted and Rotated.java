//! 1752. Check if Array Is Sorted and Rotated
//?TC:O(N);
//?TC:O(1);
class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]> nums[(i + 1) % n]) count++; 
            if(count > 1){
              return false;  
            } 
        }
        return true;
    }
}
