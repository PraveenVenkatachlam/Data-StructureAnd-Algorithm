//! 1 Two Sum
//?TC:O(N)
//?SC:O(N)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentIndex = target - nums[i];
            if (map.containsKey(currentIndex)) {
                return new int[] { map.get(currentIndex), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };

    }
}
Approach	Time	Space
Brute force	O(n²)	O(1)
Two pointers + sorting	O(n log n)	O(n)
HashMap	O(n) average	O(n)