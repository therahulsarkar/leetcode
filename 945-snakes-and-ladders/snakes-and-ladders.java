class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int minMoves = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean visited[][] = new boolean[n][n];

        q.add(1);
        visited[n-1][0] = true;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i<size; i++){
                int currentBoardVal = q.poll();
                if(currentBoardVal == n*n) return minMoves;
                
                for(int diceVal = 1; diceVal <=6; diceVal++){
                    int totalVal = diceVal + currentBoardVal;
                    if(totalVal > n*n) break;

                    int currCoordinate[] = findCoordinate(totalVal, n);
                    int row = currCoordinate[0];
                    int col = currCoordinate[1];

                    if(visited[row][col] == false){
                        visited[row][col] = true;
                        if(board[row][col] == -1){
                            q.add(totalVal);
                        }else{
                            q.add(board[row][col]);
                        }
                    }
                }
            }
            minMoves++;
        }
        return -1;
    }

    public int[] findCoordinate(int currPos, int size){
        int row = size - (currPos - 1) / size -1;
        int col = (currPos - 1) % size;

        if(row % 2 == size % 2){
            return new int[] { row, size-1-col };
        }else{
            return new int[] {row, col };
        }
    }
}