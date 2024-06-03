class Solution {
    public int appendCharacters(String s, String t) {
        int finalLength = t.length();
        int i = 0;
        int j = 0;
        
        while(i < s.length() && j <t.length()){
            if(s.charAt(i) == t.charAt(j)){
                finalLength--;
                i++;
                j++;
            } else{
                i++;
            }
        }
        
        return finalLength;
    }
}