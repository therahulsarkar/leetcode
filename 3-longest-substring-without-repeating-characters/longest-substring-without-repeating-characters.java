//Brute Force
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int maxLength = 0;
//         for(int i = 0; i<s.length(); i++){
//             String sub = "";
//              for(int j = i; j<s.length(); j++){
//                 if(sub.indexOf(s.charAt(j)) != -1){ //If the current char already exists in the substr then no need to construct further
//                     break;
//                 }
//                 sub += s.charAt(j);
//                 maxLength = Math.max(maxLength, sub.length()); //Keep updating the val of max length 
//              }
//         }

//         return maxLength;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left =0, right =0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max( map.get(s.charAt(right))+1 ,left);
            }
            map.put( s.charAt(right), right);
            maxLength = Math.max( right-left + 1 , maxLength);
            right++;
        }
        return maxLength;
    }
}