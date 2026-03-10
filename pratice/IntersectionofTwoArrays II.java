class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> intersection = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        
        return result;
    }
}

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
        

        
//      Set<Integer> set= new HashSet<>();
//      Set<Integer> result =new HashSet<>();
//      for(int num:nums1){
//         set.add(num);
//      }
//      for(int num:nums2){
//         if(set.contains(num)){
//             result.add(num);
//         }
//      }
    
//      int[] resultArray = new int[result.size()];
//      int index=0;
//      for(int setElement:result){
//         resultArray[index++]=setElement;
//      }

//      return resultArray;
//     }
// }