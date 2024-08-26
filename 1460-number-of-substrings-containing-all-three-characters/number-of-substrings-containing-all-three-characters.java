class Solution {
    public int numberOfSubstrings(String s) {
        int right = 0;
        int total = 0;
        int[] lastSeen = {-1, -1, -1};

        while(right < s.length()){
            lastSeen[s.charAt(right) - 'a'] = right;
            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                total += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            }
            right++;
        }

        return total;
    }
}