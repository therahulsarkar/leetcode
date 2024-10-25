class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];

        int index = 0;

        while(index < firstWord.length() && index < lastWord.length()){
            if(firstWord.charAt(index) != lastWord.charAt(index)){
                return firstWord.substring(0, index);
            }
            else{
                index++;
            }
        }
        return firstWord.substring(0, index);
    }
}