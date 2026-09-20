//! 48. Rotate Image
class Solution {
    private void swap(int[][] matrix, int row, int col) {
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[][] matrix) {
        int n= matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            reverse(matrix[i], 0, n - 1);
        }
    }
}

// private void swapDiagonal(int [] [] matrix, int row, int col){
//     int temp= matrix[row][col];
//     matrix[row][col]=matrix[col][row];
//     matrix[col][row]= temp;
// }
// private void reverse(int []arr,int start,int end){
//   while(start<=end){
//      int temp=arr[start];
//      arr[start]=arr[end];
//      arr[end]= temp;
//      start++;
//      end--;
//   }
// }

//  public void rotate(int[][] matrix) {
//     int n= matrix.length;
//     // Transpose
//     for(int i=0;i<n;i++){
//         for(int j=0;j<i;j++){

//          swapDiagonal(matrix,i,j);

//         }
//     }
//     for(int i=0;i<n;i++){
//         reverse(matrix[i],0,n-1);
//     }