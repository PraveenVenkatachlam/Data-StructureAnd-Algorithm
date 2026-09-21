//! 542. 01 Matrix
//? TC : O(N × M)
//?SC O(N × M)

// class Solution {
//     public int[][] updateMatrix(int[][] mat) {
//         int n = mat.length;
//         int m = mat[0].length;

//         int[] [] dist= new int [n][m];
//         Queue<int[]> q = new LinkedList<>();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(mat[i][j]==0){
//                 //   q.offer(mat[i][j]);
//                 q.offer(new int[]{i, j});

//                 }else{
//                     dist[i][j]=Integer.MAX_VALUE;

//                 }
//             }
//         }
       
//         int dx[] =new int[]{-1,0,1,0};
//         int dy[] =new int[]{0,1,0,-1};
   
//    //? Step 2
//      While (!q.isEmpty()){
//         int[] current=q.poll();
//         int row=current[0];
//         int col=current[1];

//         for(int i=0;i<4;i++){
//             int newRow= row+dx(i);
//             int newCol=col+dy(i);
//         }
//             if(row>0 && row<n && col>0 && col<m){
//                int neDist= di[row][col] +1;    

//                if(newDist<edist[newRow][newCol])  
//                {
//                 // dist[newRow][newCol]=newDist;
//                    dist[newRow][newCol] = newDist;
//                         q.offer(new int[]{newRow, newCol});
//                }                                     
//             }

//      }
//        return dist;                                                                       
//     }
// }
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] dist = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        // Step 1: Add all zero cells to queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    q.offer(new int[]{i, j});
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }
//? Step 2 Define  direction of BFS
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // Step 2: BFS
        //? Step 3  Performance of BFS
        while (!q.isEmpty()) {

            int[] current = q.poll();
            int row = current[0];
            int col = current[1];

            for (int i = 0; i < 4; i++) {

                int newRow = row + dx[i];
                int newCol = col + dy[i];

                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < m) {

                    int newDist = dist[row][col] + 1;

                    if (newDist < dist[newRow][newCol]) {
                        dist[newRow][newCol] = newDist;
                        q.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }

        return dist;
    }
}