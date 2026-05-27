//! 34 leetcode 34. Find First and Last Position of Element in Sorted Array 
class Solution {
    public int[] searchRange(int[] nums, int target) {
    
    int start=binarySearch(nums,target);
    if(start==nums.length||nums[start]!= target) return new int[] {-1,-1};
    return new int []{start,binarySearch(nums,target+1)-1};
    }

    private static int binarySearch(int nums[], int target){
           int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return left;
    }
}