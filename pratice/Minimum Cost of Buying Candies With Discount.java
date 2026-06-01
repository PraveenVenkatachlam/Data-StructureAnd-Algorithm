//! 2144. Minimum Cost of Buying Candies With Discount
class Solution {
    public int minimumCost(int[] cost) {
    
    Arrays.sort(cost);
int total=0;
    // for(int i=cost.length-1;count=o;i>=0;i)
         for (int i = cost.length - 1, count = 0; i >= 0; i--, count++) {
            
      if(count %3==2){
        continue;
      }else{
        total+=cost[i];
      }
         }
      return total;
    }
}

//? Not needed two pointer to swap use or reverse array-> for (int i = cost.length - 1, count = 0; i >= 0; i--, count++) {
class Solution {
    public int minimumCost(int[] cost) {
    
    Arrays.sort(cost);
int total=0;
    // for(int i=cost.length-1;count=o;i>=0;i)
         for (int i = cost.length - 1, count = 0; i >= 0; i--, count++) {
            
      if(count %3==2){
        continue;
      }else{
        total+=cost[i];
      }
         }
      return total;
    }
}