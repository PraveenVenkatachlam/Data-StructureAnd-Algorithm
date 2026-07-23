//* TC: O(n)
//* SC: O(1)
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        //this for loop only for reverse
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]);

        // the while Condition for reverse index
         int start = 0;
         int end = arr.length-1;
        while(start<=end){
             =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            int temp
           start++;
           end--;
            
          }
       }
   }
