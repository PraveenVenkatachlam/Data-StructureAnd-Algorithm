// 31. Next Permutation
//TC:O(N)
//SC:O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = n - 2;

        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

        if (pivot >= 0) {
            int j = n - 1;

            while (nums[j] <= nums[pivot]) {
                j--;
            }

            swap(nums, pivot, j);
        }

        reverse(nums, pivot + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}