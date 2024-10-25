class Solution {

    class TrieNode {
        boolean isEnd;
        TrieNode[] child;

        TrieNode() {
            this.isEnd = false;
            this.child = new TrieNode[26];
        }
    }

    TrieNode root = new TrieNode();
    boolean[][] visited;

    public List<String> findWords(char[][] board, String[] words) {
        visited = new boolean[board.length][board[0].length];
        Set<String> result = new HashSet<>();

        addToTrie(words);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (root.child[board[i][j] - 'a'] != null) {
                    search(board, i, j, root, "", result);
                }
            }
        }
        return new LinkedList<>(result);
    }

    public void addToTrie(String[] words) {
        for (String word : words) {
            TrieNode curr = root;
            for (int i = 0; i < word.length(); i++) {
                int currCharIndex = word.charAt(i) - 'a';
                if (curr.child[currCharIndex] == null) {
                    curr.child[currCharIndex] = new TrieNode();
                }
                curr = curr.child[currCharIndex];
            }
            curr.isEnd = true;
        }
    }

    public void search(char[][] board, int row, int col, TrieNode node, String word, Set<String> result) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col]
                || node.child[board[row][col] - 'a'] == null) {
            return;
        }

        visited[row][col] = true;
        node = node.child[board[row][col] - 'a'];
        if (node.isEnd) {
            result.add(word + board[row][col]);
        }

        search(board, row - 1, col, node, word + board[row][col], result);
        search(board, row + 1, col, node, word + board[row][col], result);
        search(board, row, col - 1, node, word + board[row][col], result);
        search(board, row, col + 1, node, word + board[row][col], result);
        visited[row][col] = false;

    }
}