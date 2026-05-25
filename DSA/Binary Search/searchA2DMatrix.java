//! 74 Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0, high =(n * m)-1;

        while(low <= high){
            int mid = low +(high - low) /2;
            int curr = matrix[mid / m]  [mid % m];

            if(curr == target) return true;
            else if(target  > curr)low =mid+1;
            else high = mid-1;
        }

       return false;
    }
}

//? Solved myself
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;
      int left=0,right=(n*m )-1;
      while(left<=right){
        int mid=left+(right-left)/2;
         int curr = matrix[mid / m]  [mid % m];
        if(curr== target){
            return true;
        }
        else if(curr<target){
            left=mid+1;
        }else{
            right=mid-1;
        }
      }
      return false;
        // int n = matrix.length;
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         if (matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}