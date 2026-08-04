//! 733. Flood Fill
//? TC O(N);
//?SC O(M)
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        dfs(sr,sc,color,image,image[sr][sc]);
        // dfs(row,col,image,initcolor);
        return image;
    }
    private void dfs(int row,int col,int color, int [][]image, int initcolor){
        int n=image.length;
        int m=image[0].length;
        if(row >= 0 && row <n && col>=0 && col<m && image[row][col]==initcolor ) {
            image[row][col]=color;
            dfs(row+1,col,color,image,initcolor);//down
            dfs(row,col+1,color,image,initcolor);//right
            dfs(row-1,col,color,image,initcolor);//up
            dfs(row,col-1,color,image,initcolor);//left
        }
    }
}