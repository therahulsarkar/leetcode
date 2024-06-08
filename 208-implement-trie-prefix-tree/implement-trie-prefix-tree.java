class TrieNode{
    boolean flag;
    TrieNode[] child;
    
    public TrieNode(){
        this.flag = false;
        child = new TrieNode[26];
    }
}

class Trie {
    
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        
        TrieNode currNode = root;
        
        for(int i = 0; i< word.length(); i++){
            
            int characterIndex = word.charAt(i) - 'a';
            
            if( currNode.child[characterIndex] == null){
                    TrieNode newNode = new TrieNode();
                    currNode.child[characterIndex] = newNode;
            }
            currNode = currNode.child[characterIndex];
        }
        
        currNode.flag = true;
    }
    
    public boolean search(String word) {
        TrieNode currNode = root;
        
        for(int i = 0; i<word.length(); i++){
            
            int characterIndex = word.charAt(i) - 'a';
            
            if( currNode.child[characterIndex] == null){
                    return false;
            }
            currNode = currNode.child[characterIndex];
        }
        
        return currNode.flag;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode currNode = root;
        
        for(int i = 0; i<prefix.length(); i++){
            
            int characterIndex = prefix.charAt(i) - 'a';
            
            if( currNode.child[characterIndex] == null){
                    return false;
            }
            currNode = currNode.child[characterIndex];
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */