class Solution {
    public boolean isSubsequence(String s, String t) {
        int remaining = s.length();
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                remaining--;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return remaining == 0;
    }
}