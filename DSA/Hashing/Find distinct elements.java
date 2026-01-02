// User function Template for Java
//!GFG
class Solution {
    static int distinct(int arr[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        return set.size();
    }
}   