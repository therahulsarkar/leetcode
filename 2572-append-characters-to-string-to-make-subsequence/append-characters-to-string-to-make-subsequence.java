class Solution {
    public int appendCharacters(String s, String t) {
        int finalLength = 0;
        int i = 0;
        int j = 0;
        
        while(i < s.length() && j <t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else{
                i++;
            }
        }

        if(j < t.length()){
            finalLength = t.length() - j;
        }
        
        return finalLength;
    }
}