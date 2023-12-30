class Solution {
    public boolean makeEqual(String[] words) {
        int length = words.length;
        if(length <= 1)  return true;

        int[] frequency = new int[26];
        
        for(String word: words){
            for(char ch: word.toCharArray()){
                frequency[ch - 'a'] += 1;
            }
        }

        for(int count: frequency){
            if(count % length != 0) return false;
        }
        return true;
    }
}