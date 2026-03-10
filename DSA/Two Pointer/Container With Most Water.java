//!11 Leetcode
//*TC O(N)
//*SC O(1)
class Solution {
    public int maxArea(int[] height) {

    int left=0,right=height.length-1;
    int maxArea=0;
    while(left<right){
        int currentHeight = Math.min(height[left],height[right]);
        int width= right-left;
        int area= currentHeight * width;
        maxArea= Math.max(maxArea,area);      

     if(height[left]<height[right]){
       left++;
     }else{
        right--;
     }
    }

    return maxArea;

    }
}

        // int maxArea = 0;
        // int left = 0;
        // int right = height.length - 1;

        // while (left < right) {
        //     maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

        //     if (height[left] < height[right]) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }

        // return maxArea;        