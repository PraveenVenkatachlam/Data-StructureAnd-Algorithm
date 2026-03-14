class Solution {
    public int firstUniqueEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (num % 2 == 0 && map.get(num) == 1) {
                return num;
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     if(num%2==0){
        //         map.put();
        //     }

        // }
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==2){
        //         return nums[i];
        //     }
        // }
        return -1;
    }
}