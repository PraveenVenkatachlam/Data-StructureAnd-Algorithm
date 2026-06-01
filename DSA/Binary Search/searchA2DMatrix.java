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

//?Row-wise Binary Search
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int m = matrix.size(), n= matrix[0].size();

        for(int i=0; i<m-1; i++){
            if(target == matrix[i][0]) return true;
            else if(target >= matrix[i][0] && target <= matrix[i+1][0]){

                if(target == matrix[i][n-1]) 
                    return true;

                int low = 0, high = n-1;

                while(low<=high){
                    int mid = low + (high-low)/2;
                    if(matrix[i][mid] == target) 
                        return true;
                    else if(target < matrix[i][mid]) 
                        high = mid-1;
                    else 
                        low = mid+1;
                }
            }
        }

        if(target >= matrix[m-1][0] && target <= matrix[m-1][n-1]){
            if(target == matrix[m-1][0]) return true;

            int low = 0, high = n-1;

            while(low<=high){
                int mid = low + (high-low)/2;
                if(matrix[m-1][mid] == target) 
                    return true;
                else if(target < matrix[m-1][mid]) 
                    high = mid-1;
                else 
                    low = mid+1;
            }
        }
        return false;
    }
};