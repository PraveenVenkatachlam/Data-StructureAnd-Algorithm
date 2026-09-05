//! 136. Single Number
//? Also can Solve using Hash
//?TC:O(N)
//?SC:O(1) 
class Solution {
    public int singleNumber(int[] nums) {
        
        int result =0;
        for(int num:nums){
             result ^= num; 
        }
        return result;
    }
}