class Solution {
    private boolean check(String word, char start, char end){
        for(char ch : word.toCharArray()){
            if(ch < start || ch > end){
                return false;
            }
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        
            if(check(word, 'a', 'z') || check(word, 'A', 'Z') || check(word.substring(1), 'a', 'z')){
                return true;
            }else{
                return false;
            }
        
    }
}