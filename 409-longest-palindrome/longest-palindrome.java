class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet();
        int total = 0;
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                total+=2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        
        if(!set.isEmpty()){
            total +=1;
        }
        
        return total;
    }
}