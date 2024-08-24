class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i = 0; i<s.length(); i++){
            String sub = "";
             for(int j = i; j<s.length(); j++){
                if(sub.indexOf(s.charAt(j)) != -1){
                    break;
                }
                sub += s.charAt(j);
                maxLength = Math.max(maxLength, sub.length());
             }
        }

        return maxLength;
    }
}