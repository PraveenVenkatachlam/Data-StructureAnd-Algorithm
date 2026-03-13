class Solution {
    public int singleNumber(int[] nums) {

             Map<Integer,Integer> map = new HashMap<>();

      for(int num:nums){
    
        map.put(num,map.getOrDefault(num,0)+1);
      }

       for(Map.Entry<Integer,Integer> pair:map.entrySet()){
        if(pair.getValue()==1){
           return pair.getKey();
        }
       }
       return -1; 

    }
}