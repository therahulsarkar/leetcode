class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] freq = new int[26];

        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        for(int j =0; j<s1.length(); j++){
            freq[s2.charAt(j) - 'a']--;
        }

        if(valid(freq)) return true;

        int right = s1.length();
        int left = 0;

        while(right < s2.length()){
            freq[s2.charAt(right) - 'a']--;
            freq[s2.charAt(left)- 'a']++;

            right++;
            left++;
            if(valid(freq)) return true;
        }
        return false;
    }

    public boolean valid(int[] freq){
        for(int val: freq){
            if(val != 0) return false;
        }
        return true;
    }
}