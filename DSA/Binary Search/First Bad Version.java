//! 278. First Bad Version
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left=1,right=n;
        while(left<right){
   
            int mid=left+(right-left)/2;

            if(isBadVersion (mid)){
               
                right=mid;
                // System.out.println(right);
            }else{
                 left=mid+1;
                    System.out.println(left);
            }
        }
     
        return left;
    }
}

   // for(int i=0;i<n;i++){
        //     if(n(bad)){
        //          System.out.println(n);
        //         return n;
               
        //     }
        // }
        // return n;
View less
 
Write your notes here
Select related tags
0/5
Search questions


