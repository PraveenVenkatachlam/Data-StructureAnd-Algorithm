class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int ans[] = new int[result.size()];
        int i = 0;
        for(int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}

//! Hareesh Approach
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Set<Integer> set1 =new HashSet<>();
     Set<Integer> resultSet1 = new HashSet<>();

     for(int num:nums1){
        set1.add(num);
     }
     for(int num:nums2){
        if(set1.contains(num)){
            resultSet1.add(num);
        }
     }
     int resArray[] =new int [resultSet1.size()];
     int index=0;
     for(int SetElement: resultSet1){
        resArray[index++] =SetElement;
     }
    return resArray;
    }
}



//? Another optimized approach
class Solution {
  public int[] setIntersection(Set<Integer> set1, Set<Integer> set2) {
    int[] output = new int[set1.size()];
    int idx = 0;
    for (Integer s : set1) {
        if (set2.contains(s)){
            output[idx++] = s;
        } 
    }
    return Arrays.copyOf(output, idx);
  }
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    for (Integer n : nums1) {
        set1.add(n);
    } 
    Set<Integer> set2 = new HashSet<>();
    for (Integer n : nums2) {
        set2.add(n);
    }
    if (set1.size() < set2.size()){
        return setIntersection(set1, set2);
    } else {
        return setIntersection(set2, set1);
    } 
  }
}