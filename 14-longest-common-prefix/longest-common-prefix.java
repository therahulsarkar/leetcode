// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String firstWord = strs[0];

//         for(int i =1; i<strs.length; i++){
//             while(strs[i].indexOf(firstWord) != 0){
//                 firstWord = firstWord(0, firstWord.length()-1);
//             }
//         }

//         return firstWord;
//     }
// }

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