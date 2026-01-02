//! LeetCode 136
//* TC: O(n)
class Solution {
    public int singleNumber(int[] nums) {
        
        int result =0;
        for(int num:nums){
             result ^= num; 
        }
        return result;
    }
}
//! Hareesh Approach
class Solution {
    public int singleNumber(int[] nums) {
        
    // if(nums ==0) return 0;
    Map<Integer,Integer> map =new HashMap<>();
    for(int num:nums){
        if(map.containsKey(num)){
            int freq=map.get(num);
            map.put(num,freq+1);
        }else{
           map.put(num,1);
        }

        //or
         //map.put(num,map.getOrDefault(num,0)+1);
    }
   for(Map.Entry<Integer,Integer> pair:map.entrySet()){
    if(pair.getValue()==1){
        return pair.getKey();
    }
   }
return 0;
    }
}
 