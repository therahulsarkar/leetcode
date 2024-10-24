class StreamChecker {

    class TrieNode {
        boolean isEnd;
        TrieNode[] child;

        TrieNode() {
            this.isEnd = false;
            this.child = new TrieNode[26];
        }
    }

    TrieNode root = new TrieNode();
    StringBuilder str = new StringBuilder();

    public StreamChecker(String[] words) {
        for (int i = 0; i < words.length; i++) {
            createTrie(words[i]);
        }
    }

    public boolean query(char letter) {
        str.append(letter);
        TrieNode curr = root;
        for (int i = str.length() - 1; i >= 0; i--) {
            int currCharIndex = str.charAt(i) - 'a';
            if (curr.child[currCharIndex] == null) {
                return false;
            }

            curr = curr.child[currCharIndex];

            if (curr.isEnd) {
                return true;
            }

        }
        return false;
    }

    public void createTrie(String word) {
        TrieNode curr = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            int currCharIndex = word.charAt(i) - 'a';
            if (curr.child[currCharIndex] == null) {
                curr.child[currCharIndex] = new TrieNode();
            }
            curr = curr.child[currCharIndex];

        }
        curr.isEnd = true;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */