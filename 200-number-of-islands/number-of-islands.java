class Solution {
    class Pair {
        int first; 
        int second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        } 
    }

    private void BFS(int row, int col, boolean[][] visited, char[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        visited[row][col] = true;
        queue.add(new Pair(row, col));

        int r = grid.length;
        int c = grid[0].length;

        // Arrays to represent the 8 possible directions
        int[] rowDelta = {-1, 0, 1, 0};
        int[] colDelta = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int curr_row = queue.peek().first;
            int curr_col = queue.peek().second;
            queue.poll();

            // Explore all 8 directions
            for (int i = 0; i < 4; i++) {
                int newRow = curr_row + rowDelta[i];
                int newCol = curr_col + colDelta[i];

                // Check if the new position is valid and not yet visited
                if (newRow >= 0 && newCol >= 0 && newRow < r && newCol < c 
                    && !visited[newRow][newCol] && grid[newRow][newCol] == '1') {
                    visited[newRow][newCol] = true;
                    queue.add(new Pair(newRow, newCol));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0; // Handle edge case for empty grid

        int r = grid.length;
        int c = grid[0].length;

        boolean[][] visited = new boolean[r][c];
        int totalIsland = 0;

        // Traverse the entire grid
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                // If the cell is land ('1') and not visited yet, it's a new island
                if (!visited[row][col] && grid[row][col] == '1') {
                    totalIsland++;
                    BFS(row, col, visited, grid);
                }
            }
        }
        return totalIsland;
    }
}