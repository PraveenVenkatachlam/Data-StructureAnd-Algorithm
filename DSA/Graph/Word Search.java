// 79. Word Search
// class Solution {
//     public boolean exist(char[][] board, String word) {
//         int n=board.length, m=board[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(board[i][j]==word.charAt(0)&& dfs(i,j,0,word,board))
//                 return true;
//             return false;    
//             }
//         }
//          private boolean dfs(int row,int col,int start,String word,char[][] board){
//             if(word.length()<start)return true;
//             if(row<0||col<0||row>board.length||col>board[0].length||board[row][col]=='0' ||board[row][col]!==word.charAt(start)) return false;
           
//            char temp=board[row][col];
//            board[row][col]='0';
//             if(
//                   dfs(row+1,col,start+1,word,board)||
//                   dfs(row-1,col,start+1,word,board)||
//                   dfs(row,col+1,start+1,word,board)||
//                   dfs(row,col-1,start+1,word,board))
//                   return true;
//           board[row][col]=temp;
//           return false;
           
//         }
//     }
// }
class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == word.charAt(0) &&
                    dfs(i, j, 0, word, board)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int row, int col, int start,
                        String word, char[][] board) {

        // All characters matched
        if (start == word.length()) {
            return true;
        }

        // Out of bounds or character doesn't match
        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length ||
            board[row][col] == '0' ||
            board[row][col] != word.charAt(start)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '0'; // mark as visited

        boolean found =
            dfs(row + 1, col, start + 1, word, board) ||
            dfs(row - 1, col, start + 1, word, board) ||
            dfs(row, col + 1, start + 1, word, board) ||
            dfs(row, col - 1, start + 1, word, board);

        board[row][col] = temp; // restore

        return found;
    }
}