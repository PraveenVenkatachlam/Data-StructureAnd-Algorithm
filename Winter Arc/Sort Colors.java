//! 75. Sort Colors
//TC:O(N)
//SC:O(1)
class Solution {
    private void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1,mid=0;
        while(mid<=right){
            if(nums[mid]==2){
                swap(nums,mid,right--);
            }else if(nums[mid]==0){
              swap(nums,left++,mid++);
            }else{
                mid++;
            }
        }
    }
}