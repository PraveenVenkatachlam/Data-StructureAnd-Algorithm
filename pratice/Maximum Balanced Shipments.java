class Solution {
       public int maxBalancedShipments(int[] weight) {
        int res = 0;
        for (int i = 0; i + 1 < weight.length; i++) {
            if (weight[i] > weight[i + 1]) {
                i++;
                res++;
            }
        }
        return res;
    }
    // public int maxBalancedShipments(int[] weight) {

    //     int count = 0, max = 0;
    //     for (int num : weight) {
    //      max=Math.max(num,max);
    //      if(num<max){
    //         count++;
    //           max=0;
    //      }
    //     }
    //     return count;
    // }
}