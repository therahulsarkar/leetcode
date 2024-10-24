class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && DFS(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean DFS(char[][] board, String word, int row, int col, int count) {
        if (count == word.length())
            return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(count)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '*';

        boolean found = DFS(board, word, row - 1, col, count + 1) ||
                DFS(board, word, row + 1, col, count + 1) ||
                DFS(board, word, row, col - 1, count + 1) ||
                DFS(board, word, row, col + 1, count + 1);
        board[row][col] = temp;
        return found;
    }
}