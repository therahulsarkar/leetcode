class Solution {
    public int characterReplacement(String s, int k) {
        int longest = 0, right =0, left =0, max =0;
        int arr[] = new int[26];

        while(right <s.length()){

            arr[s.charAt(right) - 'A']++;
            max = Math.max(max, arr[s.charAt(right) - 'A']); //Store the freq of most occured character 
            
            if((right-left+1) - max > k){
                arr[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(longest, right-left+1);
            right++;
        }

        return longest;
    }
}