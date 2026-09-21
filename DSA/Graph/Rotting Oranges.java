//! 994. Rotting Oranges
//?TC:O(N*M)
//?SC:O(N*M)
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0, time = 0;
        //Step 1:Add all rotten orange and count fresh one
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2)
                    queue.offer(new int[] { i, j, 0 });
                else if (grid[i][j] == 1) 
                    fresh++;

                }
            }
            //Step 2 bfs
            int[] dx = { -1, 0, 1, 0 }, dy = { 0, 1, 0, -1 };
            while (!queue.isEmpty()) {
                int[] curr = queue.poll();
                int row = curr[0], col = curr[1], t = curr[2];
                time = Math.max(time, t);

                for (int d = 0; d < 4; d++) {
                    int newRow = row + dx[d], newCol = col + dy[d];
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol]==1) {
                        grid[newRow][newCol] = 2;
                        fresh--;
                        queue.offer(new int[] { newRow, newCol, t + 1 });
                    }
                }
            }

        

        return fresh == 0 ? time : -1;
    }
}