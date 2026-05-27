//! 69. Sqrt(x)
class Solution {
    public int mySqrt(int x) {
         if(x<2)return x;

         int left=0,right=x/2;
         while(left<=right){
            int mid=(left+right)/2;
            long sqr=(long) mid* mid;
            System.out.println(sqr);
            if(sqr==x) return mid;

            else if(sqr<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
         }
         return right;
    }
}
Brut Force Solution 
class Solution {
    public int mySqrt(int x) {
    
      if(x<2){
        return x;
      }
      int i=2;
      while(i*i <=x){
        i+=1;
      }
return i-1;
    
    }
}