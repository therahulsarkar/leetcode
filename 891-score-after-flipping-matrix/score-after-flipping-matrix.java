class Solution {
    public int matrixScore(int[][] grid) {

        if(grid == null || grid.length == 0) return 0;

        int[] arr = new int[grid[0].length];
        arr[0] = grid.length;


        for(int i=0; i<grid.length; i++) {
            if(grid[i][0] == 1) {
                continue;
            }
            for(int j=0; j<grid[0].length; j++) {
                grid[i][j] = grid[i][j] == 0 ? 1 : 0;
            }
        }

  
        for(int i=0; i<grid[0].length; i++) {
            int ones = 0;
            for(int j=0; j<grid.length; j++) {
                if(grid[j][i] == 1) {
                    ones++;
                }
            }
            arr[i] = ones;
        }

      
        int ans = 0;
        int rows = grid.length;

        for(int i=0; i<arr.length; i++) {
            int val = arr[i];
            if(arr[i] < rows-arr[i]) {
                val = rows - arr[i];
            }
            ans += (Math.pow(2,grid[0].length-i-1) * val);
        }

        return ans;
    }
}