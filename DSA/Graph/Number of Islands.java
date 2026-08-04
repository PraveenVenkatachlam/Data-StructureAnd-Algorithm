//! 200. Number of Islands
//? Time Complexity: O(N × M)
//? Space Complexity: O(N × M)   // Worst case
class Solution {
    public int numIslands(char[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
         int island=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          
            if(grid[i][j]=='1'){
                island++;
                visit(i,j,grid);
            }
        }
       }
       return island;
    }
    private void visit(int row,int col,char[][]grid){
    int n=grid.length;
    int m=grid[0].length;
    int dx[] =new int [] {-1,0,1,0};
    int dy[] =new int [] {0,1,0,-1};
    if(row>=0&& row<n && col>=0 && col<m && grid[row][col]=='1'){
        grid[row][col]='2';
        for(int i=0;i<4;i++){
            visit(row+dx[i],col+dy[i],grid);
        }
    }
    }
}