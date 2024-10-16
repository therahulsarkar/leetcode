class Solution {
    class Pair {
        int first;
        int second;
        int time;

        Pair(int first, int second, int time) {
            this.first = first;
            this.second = second;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<Pair> queue = new LinkedList<Pair>();
        int[][] visited = new int[r][c];

        int fresh_count = 0;
        int fresh_to_rotten_count = 0;

        // Visit every cell and push the rotten cells in queue, mark them visited and
        // count the fresh ones as well
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (grid[row][col] == 2) {
                    queue.add(new Pair(row, col, 0));
                    visited[row][col] = 2;
                } else {
                    visited[row][col] = 0;
                }

                if (grid[row][col] == 1) {
                    fresh_count++;
                }
            }
        }

        int maxTime = 0;
        // For all the 4 neighbours of each cell
        int[] deltaRow = { 0, 0, -1, 1 };
        int[] deltaCol = { -1, 1, 0, 0 };

        while (!queue.isEmpty()) {
            // Extract the front node data from queue, remove it from queue and visit all
            // its neighbours
            int curr_row = queue.peek().first;
            int curr_col = queue.peek().second;
            int curr_time = queue.peek().time;

            // Calculate the max time as well to know max time needed to rott all the
            // tomtoes
            maxTime = Math.max(maxTime, curr_time);
            queue.remove();

            for (int i = 0; i < 4; i++) {
                // Visit all 4 neighbours of teh current node
                int newRow = curr_row + deltaRow[i];
                int newCol = curr_col + deltaCol[i];

                // If the cell has not been visited and it has fresh orange then mark it as
                // visited, push it to queue and inc the counter that counts the total no of
                // conversion from fresh to rotten oranges
                if (newRow >= 0 && newRow < r && newCol >= 0 && newCol < c
                        && visited[newRow][newCol] == 0 && grid[newRow][newCol] == 1) {
                    visited[newRow][newCol] = 2;
                    queue.add(new Pair(newRow, newCol, curr_time + 1));
                    fresh_to_rotten_count++;
                }
            }
        }
        // If the total no of fresh oranges are not equal to the number of "fresh to
        // rotten oranges" that means we could rott all the oranges and the grid has
        // oranges that can be rotted, so return -1
        if (fresh_count != fresh_to_rotten_count) {
            return -1;
        } else {
            // else return the unit of time required to rott all the oranges
            return maxTime;
        }
    }
}